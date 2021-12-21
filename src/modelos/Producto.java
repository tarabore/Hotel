package modelos;

public class Producto {

    private int idProducto;
    private String nombre;
    private String descripcion;
    private String unidadMedida;
    private Double precioVenta;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String descripcion, String unidadMedida, Double precioVenta) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precioVenta = precioVenta;
    }

    public int getIdproducto() {
        return idProducto;
    }

    public void setIdproducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
