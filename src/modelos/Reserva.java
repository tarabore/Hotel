
package modelos;

import java.sql.Date;

public class Reserva {
    private int idReserva;
    private int idHabitacion;
    private int idCliente;
    private int idTrabajador;
    private String tipoReserva;
    private Date fechaReserva;
    private Date fechaIngreso;
    private Date fechaSalida;
    private Double costoAlojamiento;
    private String estado;
    
    public Reserva(){
        
    }
    
    public Reserva(int idReserva, int idHabitacion, int idCliente, int idTrabajador, String tipoReserva, Date fechaReserva, Date fechaIngreso, Date fechaSalida, Double costoAlojamiento, String estado){
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.idTrabajador = idTrabajador;
        this.tipoReserva = tipoReserva;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costoAlojamiento = costoAlojamiento;
        this.estado = estado;
    }

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * @return the idHabitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @param idHabitacion the idHabitacion to set
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idTrabajador
     */
    public int getIdTrabajador() {
        return idTrabajador;
    }

    /**
     * @param idTrabajador the idTrabajador to set
     */
    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    /**
     * @return the tipoReserva
     */
    public String getTipoReserva() {
        return tipoReserva;
    }

    /**
     * @param tipoReserva the tipoReserva to set
     */
    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    /**
     * @return the fechaReserva
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * @param fechaReserva the fechaReserva to set
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the fechaSalida
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the costoAlojamiento
     */
    public Double getCostoAlojamiento() {
        return costoAlojamiento;
    }

    /**
     * @param costoAlojamiento the costoAlojamiento to set
     */
    public void setCostoAlojamiento(Double costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
