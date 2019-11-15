package modelos;

public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private String apellidoMadre;
    private String tipoDoc;
    private String numDoc;
    private String direccion;
    private String telefono;
    private String email;

    public Persona() {
    }

    public Persona(int idpersona, String nombre, String apellido, String apellidoMadre, String tipoDoc, String numDoc, String direccion, String telefono, String email) {
        this.idPersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellidoMadre = apellidoMadre;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdpersona() {
        return idPersona;
    }

    public void setIdpersona(int idpersona) {
        this.idPersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
