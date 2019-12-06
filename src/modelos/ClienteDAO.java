package modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalRegistros;
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String[] titulos = {"ID","Nombre","Apaterno","Amaterno","Doc","Numero Documento","Direccion","Telefono","Email","Codigo"};
        String [] registro = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select p.idpersona, p.nombre, p.apaterno, p.amaterno, p.tipo_documento, p.num_documento, "
                + "p.direccion, p.telefono, p.email, c.codigo_cliente "
                + "from persona p inner join cliente c on p.idpersona=c.idpersona "
                + "where concat(p.apaterno, ' ', p.nombre) like '%"
                + buscar
                + "%' order by 3, 2";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next()){
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apaterno");
                registro[3] = rs.getString("amaterno");
                registro[4] = rs.getString("tipo_documento");
                registro[5] = rs.getString("num_documento");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("telefono");
                registro[8] = rs.getString("email");
                registro[9] = rs.getString("codigo_cliente");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;       
            }
        }
    public boolean insertar(Cliente dts){
        sSQL = "insert into persona(nombre, apaterno, amaterno, tipo_documento, num_documento, direccion, telefono, email) "
                + "values(?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into cliente(idpersona, codigo_cliente) "
                + "values((select idpersona from persona order by idpersona desc limit 1), ?)";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setString(1,dts.getNombre());
            pst.setString(2,dts.getApellido());
            pst.setString(3,dts.getApellidoMadre());
            pst.setString(4,dts.getTipoDoc());
            pst.setString(5,dts.getNumDoc());
            pst.setString(6,dts.getDireccion());
            pst.setString(7,dts.getTelefono());
            pst.setString(8,dts.getEmail());
            pst2.setString(1,dts.getCodigo());
            int n = pst.executeUpdate();
            if(n!=0){
                int n2 = pst2.executeUpdate();
                if(n2 != 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
                }
            }
    public boolean editar(Cliente dts){
        sSQL = "update persona set nombre=?,apaterno=?,amaterno=?,tipo_documento=?,num_documento=?,"
+ "direccion=?, telefono=?, email=? where idpersona=?";
        sSQL2 = "update cliente set codigo_cliente=? "
                + "where idpersona=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setString(1,dts.getNombre());
            pst.setString(2,dts.getApellido());
            pst.setString(3,dts.getApellidoMadre());
            pst.setString(4,dts.getTipoDoc());
            pst.setString(5,dts.getNumDoc());
            pst.setString(6,dts.getDireccion());
            pst.setString(7,dts.getTelefono());
            pst.setString(8,dts.getEmail());
            pst.setInt(9,dts.getIdpersona());
            pst2.setString(1,dts.getCodigo());
            pst2.setInt(2,dts.getIdpersona());
            int n = pst.executeUpdate();
            if(n!=0){
                int n2 = pst2.executeUpdate();
                if(n2 != 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;   
            }
        }
    public boolean eliminar(Cliente dts){
        sSQL = "delete from cliente where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setInt(1, dts.getIdpersona());
            pst2.setInt(1, dts.getIdpersona());
            int n = pst.executeUpdate();
            if(n!= 0){
                int n2 = pst2.executeUpdate();
                if(n2!= 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
                }
            }catch(Exception e){
                JOptionPane.showConfirmDialog(null,e);
                return false;
        }
    }
}
    
    

