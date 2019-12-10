
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

        
public class ReservaDAO {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdHabitacion", "IdCliente", "Cliente", "IdTrabajador", "Trabajador", "Tipo Reserva", "Fecha Reserva", "Fecha Ingreso", "Fecha Salida", "Costo", "Estado"};
        String[] registro = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select r.idreserva, r.idhabitacion, h.numero, r.idcliente,"
                + "(select nombre from persona where idpersona = r.idcliente)as clienten,"
                + "(select apaterno from persona where idpersona = r.idcliente)as clienteap,"
                + "r.idtrabajador, (select nombre from persona where idpersona = r.idtrabajador)as trabajadorn,"
                + "(select apaterno from persona where idpersona = r.idtrabajador)as trabajadorap,"
                + "r.tipo_reserva, r.fecha_reserva, r.fecha_ingresa, r.fecha_salida,"
                + "r.costo_alojamiento, r.estado from reserva r"
                + "inner join habitacion h on r.idhabitacion = h.idhabitacion "
                + "where r.idhabitacion like '%" + buscar + "%' order bay idreserva desc";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next()){
                registro[0] = rs.getString("idreserva");
                registro[1] = rs.getString("idhabitacion");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten")+ " "+ rs.getString("clienteap");
                registro[5] = rs.getString("idtrabajador");
                registro[6] = rs.getString("trabajadorn")+ " "+ rs.getString("trabajadorap");
                registro[7] = rs.getString("tipo_reserva");
                registro[8] = rs.getString("fecha_reserva");
                registro[9] = rs.getString("fecha_ingresa");
                registro[10] = rs.getString("fecha_salida");
                registro[11] = rs.getString("costo_alojamiento");
                registro[12] = rs.getString("estado");
                totalRegistros = totalRegistros+1;
                modelo.addRow(registro);
            }
            return modelo;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }        
    }
    
    public boolean insertar (Reserva dts){
        sSQL = "insert into reserva (idhabitacion, idcliente, idtrabajador, tipo_reserva, fecha_reserva, fecha_ingresa, fecha_salida, costo_alojamiento, estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdHabitacion());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdTrabajador());
            pst.setString(4, dts.getTipoReserva());
            pst.setDate(5, dts.getFechaReserva());
            pst.setDate(6, dts.getFechaIngreso());
            pst.setDate(7, dts.getFechaSalida());
            pst.setDouble(8, dts.getCostoAlojamiento());
            pst.setString(9, dts.getEstado());
            int n = pst.executeUpdate();
            if ( n != 0){
                return true;
            }else {
                return false;
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    public boolean editar (Reserva dts){
        sSQL = "update reserva set idhabitacion=?, idcliente=?, idtrabajador=?, tipo_reserva=?, fecha_reserva=?, fecha_ingresa=?, fecha_salida=?, costo_alojamiento=?, estado=?, where idreserva=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdHabitacion());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdTrabajador());
            pst.setString(4, dts.getTipoReserva());
            pst.setDate(5, dts.getFechaReserva());
            pst.setDate(6, dts.getFechaIngreso());
            pst.setDate(7, dts.getFechaSalida());
            pst.setDouble(8, dts.getCostoAlojamiento());
            pst.setString(9, dts.getEstado());
            pst.setInt(10, dts.getIdReserva());
            int n = pst.executeUpdate();
            if ( n != 0){
                return true;
            }else {
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    public boolean pagar(Reserva dts){
        sSQL = "update reserva set estado = 'Pagada' where idreserva=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdHabitacion());
            int n = pst.executeUpdate();
            if ( n != 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminar (Reserva dts){
        sSQL = "delete from reserva where idreserva=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdHabitacion());
            int n = pst.executeUpdate();
            if ( n != 0){
                return true;
            }else {
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
