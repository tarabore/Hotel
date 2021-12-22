package modelos;

public class Cliente extends Persona {
    private String codigo;
public Cliente() {
}
public Cliente(String codigo) {
this.codigo = codigo;
}
public String getCodigo() {
return codigo;
}
public void setCodigo(String codigo) {
this.codigo = codigo;
}
}
