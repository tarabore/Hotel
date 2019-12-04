package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PagoDAO {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Idreserva", "Comprobante", "Número", "Igv", "Total", "Fecha Emisión", "Fecha Pago"};
        String[] registro = new String[8];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from pago where idreserva = "
                + buscar
                + " order by idpago desc";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                registro[0] = rs.getString("idpago");
                registro[1] = rs.getString("idreserva");
                registro[2] = rs.getString("tipo_comprobante");
                registro[3] = rs.getString("num_comprobante");
                registro[4] = rs.getString("igv");
                registro[5] = rs.getString("total_pago");
                registro[6] = rs.getString("fecha_emision");
                registro[7] = rs.getString("fecha_pago");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null,e);
            return null;
        }
    }
    public boolean insertar(Pago dts){
        sSQL = "insert into pago (idreserva, tipo_comprobante, num_comprobante,igv,total_pago,fecha_emision,fecha_pago)"
                + "values (?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getTipoComprobante());
            pst.setString(3, dts.getNumComprobante());
            pst.setDouble(4, dts.getImpuesto());
            pst.setDouble(5,dts.getTotalPago());
            pst.setDate(6, dts.getFechaEmision());
            pst.setDate(7, dts.getFechaPago());
            int n = pst.executeUpdate();
            if (n !=0){
                return true;
            }else {
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean editar(Pago dts){
        sSQL = "update pago set idreserva=?, tipo_comprobante=?, num_comprobante=?, igv=?, total_pago=?, fecha_emision=?, fecha_pago=?"
                + " where idpago=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getTipoComprobante());
            pst.setString(3, dts.getNumComprobante());
            pst.setDouble(4, dts.getImpuesto());
            pst.setDouble(5,dts.getTotalPago());
            pst.setDate(6, dts.getFechaEmision());
            pst.setDate(7, dts.getFechaPago());
            pst.setInt(8, dts.getIdPago());
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean eliminar(Pago dts){
        sSQL = "delete from pago where idpago=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdPago());
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else {
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
