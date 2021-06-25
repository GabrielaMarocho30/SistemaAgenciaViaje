package capaNegocio;

import java.util.ArrayList;
import java.util.Date;

public class Pago {

    public Pago() {
        this.comprobante = "";
        this.numeroPago = "";
        this.fechaPago = null;
        this.tipoPago = "";
        this.total = 0.0;
    }
    

    public Pago(String comprobante, String numeroPago, Date fechaPago, String tipoPago, Double total) {
        this.comprobante = comprobante;
        this.numeroPago = numeroPago;
        this.fechaPago = fechaPago;
        this.tipoPago = tipoPago;
        this.total = total;
    }
    
    private String comprobante;
    private String numeroPago;
    private Date fechaPago;
    private String tipoPago;
    private Double total;
    public ReservaPaquete correspondePago;   

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(String numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    private String Pagar(){
        return "El método no ha sido implementado";
    }
    private String RegistarPago(){
        return "El método no ha sido implementado";
    }
    
}
