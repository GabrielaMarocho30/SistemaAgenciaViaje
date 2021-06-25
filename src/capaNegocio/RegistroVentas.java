package capaNegocio;

import java.util.ArrayList;
import java.util.Date;
        
public class RegistroVentas {

    public RegistroVentas() {
        this.codigoVenta = "";
        this.paqueteVendido = "";
        this.fechaReservaVenta = null;
        this.encargadoventa = "";
    }

    public RegistroVentas(String codigoVenta, String paqueteVendido, String metodoPagodeVenta, double precioVenta, Date fechaReservaVenta) {
        this.codigoVenta = codigoVenta;
        this.paqueteVendido = paqueteVendido;
        this.fechaReservaVenta = fechaReservaVenta;
        this.encargadoventa = encargadoventa;
    }
    
    private String codigoVenta;
    private String paqueteVendido;
    private Date fechaReservaVenta;
    private String encargadoventa;
    
    public ArrayList<Encargado> reporteVentas = new ArrayList();
    
    public String getEncargadoventa() {
        return encargadoventa;
    }

    public void setEncargadoventa(String encargadoventa) {
        this.encargadoventa = encargadoventa;
    }
   

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getPaqueteVendido() {
        return paqueteVendido;
    }

    public void setPaqueteVendido(String paqueteVendido) {
        this.paqueteVendido = paqueteVendido;
    }

    public Date getFechaReservaVenta() {
        return fechaReservaVenta;
    }

    public void setFechaReservaVenta(Date fechaReservaVenta) {
        this.fechaReservaVenta = fechaReservaVenta;
    }

}