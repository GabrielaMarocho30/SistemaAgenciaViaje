package capaNegocio;

import java.util.ArrayList;
import java.util.Date;
public class Administrador {

    public Administrador() {
        this.codigoAdministrador = "";
        this.apellidosAdministrador = "";
        this.nombresAdministrador = "";
        this.fechaNacAdministrador = null;
        this.departamentoVentas = "";
        
    }

    public Administrador(String codigo, String apellidos, String nombres, Date fechaNac, String departamentoVentas, double pagoProveedor) {
        this.codigoAdministrador = codigo;
        this.apellidosAdministrador = apellidos;
        this.nombresAdministrador = nombres;
        this.fechaNacAdministrador = fechaNac;
        this.departamentoVentas = departamentoVentas;
        
    }
    
    
    private String codigoAdministrador;
    private String apellidosAdministrador;
    private String nombresAdministrador;
    private Date fechaNacAdministrador;
    private String departamentoVentas;
    private double pagoProveedor;
    public Encargado listaEncargados; 
    
    public String getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setCodigoAdministrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }

    public String getApellidosAdministrador() {
        return apellidosAdministrador;
    }

    public void setApellidosAdministrador(String apellidosAdministrador) {
        this.apellidosAdministrador = apellidosAdministrador;
    }

    public String getNombresAdministrador() {
        return nombresAdministrador;
    }

    public void setNombresAdministrador(String nombresAdministrador) {
        this.nombresAdministrador = nombresAdministrador;
    }

    public Date getFechaNacAdministrador() {
        return fechaNacAdministrador;
    }

    public void setFechaNacAdministrador(Date fechaNacAdministrador) {
        this.fechaNacAdministrador = fechaNacAdministrador;
    }

    public String getDepartamentoVentas() {
        return departamentoVentas;
    }

    public void setDepartamentoVentas(String departamentoVentas) {
        this.departamentoVentas = departamentoVentas;
    }

        
    public String ComunicarProveedores(){
        return "No se ha implementado este metodo";
    }
    public String AyudaCliente(){
        return "No se ha implementado este metodo";
    }            
    public String ControlDatos(){
        return "No se ha implementado este metodo";
    }            

}
