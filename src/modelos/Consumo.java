package modelos;

public class Consumo {

    private int idConsumo;
    private int idReserva;
    private int idProducto;
    private Double cantidad;
    private Double precioVenta;
    private String estado;

    public Consumo() {
    }

    public Consumo(int idconsumo, int idreserva, int idproducto, Double cantidad, Double precio_venta, String estado) {
        this.idConsumo = idconsumo;
        this.idReserva = idconsumo;
        this.idProducto = idconsumo;
        this.cantidad = cantidad;
        this.precioVenta = precio_venta;
        this.estado = estado;
    }

    public int getIdconsumo() {
        return idConsumo;
    }

    public void setIdconsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public int getIdreserva() {
        return idReserva;
    }

    public void setIdreserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    public int getIdproducto() {
        return idProducto;
    }

    public void setIdproducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
