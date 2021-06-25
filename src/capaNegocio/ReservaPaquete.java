package capaNegocio;

import java.util.Date;

public class ReservaPaquete {

    public ReservaPaquete() {
        this.fechaReservaPaquete = null;
        this.fechaIdaReservaPaquete =null;
        this.fechaVueltaReservaPaquete = null;
        this.tarifaReservaPaquete = 0.0;
        this.tipoReservaPaquete = "";
        this.destinoReservaPaquete = "";
    }

    public ReservaPaquete(Date fechaReservaPaquete, Date fechaIdaReservaPaquete, Date fechaVueltaReservaPaquete, Double tarifaReservaPaquete, String tipoReservaPaquete, String destinoReservaPaquete) {
        this.fechaReservaPaquete = fechaReservaPaquete;
        this.fechaIdaReservaPaquete = fechaIdaReservaPaquete;
        this.fechaVueltaReservaPaquete = fechaVueltaReservaPaquete;
        this.tarifaReservaPaquete = tarifaReservaPaquete;
        this.tipoReservaPaquete = tipoReservaPaquete;
        this.destinoReservaPaquete = destinoReservaPaquete;
    }
    
    private Date fechaReservaPaquete;
    private Date fechaIdaReservaPaquete;
    private Date fechaVueltaReservaPaquete;
    private Double tarifaReservaPaquete;
    private String tipoReservaPaquete;
    private String destinoReservaPaquete;
    public Cliente esReservado;
    public Pago correspondePago;
    public Paquete pertenecePaquete;

    public Date getFechaReservaPaquete() {
        return fechaReservaPaquete;
    }

    public void setFechaReservaPaquete(Date fechaReservaPaquete) {
        this.fechaReservaPaquete = fechaReservaPaquete;
    }

    public Date getFechaIdaReservaPaquete() {
        return fechaIdaReservaPaquete;
    }

    public void setFechaIdaReservaPaquete(Date fechaIdaReservaPaquete) {
        this.fechaIdaReservaPaquete = fechaIdaReservaPaquete;
    }

    public Date getFechaVueltaReservaPaquete() {
        return fechaVueltaReservaPaquete;
    }

    public void setFechaVueltaReservaPaquete(Date fechaVueltaReservaPaquete) {
        this.fechaVueltaReservaPaquete = fechaVueltaReservaPaquete;
    }

    public Double getTarifaReservaPaquete() {
        return tarifaReservaPaquete;
    }

    public void setTarifaReservaPaquete(Double tarifaReservaPaquete) {
        this.tarifaReservaPaquete = tarifaReservaPaquete;
    }

    public String getTipoReservaPaquete() {
        return tipoReservaPaquete;
    }

    public void setTipoReservaPaquete(String tipoReservaPaquete) {
        this.tipoReservaPaquete = tipoReservaPaquete;
    }

    public String getDestinoReservaPaquete() {
        return destinoReservaPaquete;
    }

    public void setDestinoReservaPaquete(String destinoReservaPaquete) {
        this.destinoReservaPaquete = destinoReservaPaquete;
    }
    private String RevisarReservaPaquete(){
        return "No se ha implementado el método";
    }
    private String ConfirmarReservaPaquete(){
        return "No se ha implementato el método";
    }
}
