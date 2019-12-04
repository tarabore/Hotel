package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsumoDAO {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalRegistros;
    public Double totalConsumo;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "idreserva", "idproducto", "producto", "cantidad", "Precio Vneta", "Estado"};
        String[] registro = new String[7];
        totalRegistros = 0;
        totalConsumo = 0.0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select c.idconsumo, c.idreserva, c.idproducto, p.nombre, c.cantidad, c.precio_venta, c.estado"
                + "from consumo c inner join producto p on c.idproducto = p.idproducto"
                + "where c.idreserva = " + buscar + " order by c.idconsumo desc";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idconsumo");
                registro[1] = rs.getString("idreserva");
                registro[2] = rs.getString("idproducto");
                registro[3] = rs.getString("nombre");
                registro[4] = rs.getString("cantidad");
                registro[5] = rs.getString("precio_venta");
                registro[6] = rs.getString("estado");
                totalRegistros = totalRegistros + 1;
                totalConsumo = totalConsumo + (rs.getDouble("cantidad") * rs.getDouble("precio_vanta"));
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Consumo dts) {
        sSQL = "insert into consumo (idreserva, idproducto, cantidad, precio_venta, estado) values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdreserva());
            pst.setInt(2, dts.getIdproducto());
            pst.setDouble(3, dts.getCantidad());
            pst.setDouble(4, dts.getPrecioVenta());
            pst.setString(5, dts.getEstado());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Consumo dts) {
        sSQL = "update consumo set idreserva=?, idproducto=?, cantidad=?, precio_venta=?, estado=? where idconsumo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdreserva());
            pst.setInt(2, dts.getIdproducto());
            pst.setDouble(3, dts.getCantidad());
            pst.setDouble(4, dts.getPrecioVenta());
            pst.setString(5, dts.getEstado());
            pst.setInt(6, dts.getIdconsumo());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Consumo dts) {
        sSQL = "delete from consumo where idconsumo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdconsumo());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
