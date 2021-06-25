package capaNegocio;

import java.util.Date;

public class Cliente {

    public Cliente() {
        this.nombres = "";
        this.apellidos = "";
        this.dni = "";
        this.fechaNacimiento = null;
        this.celular = "";
    }

    public Cliente(String nombres, String apellidos, String dni, Date fechaNacimiento, String celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
    }
    
    private String nombres;
    private String apellidos;
    private String dni;
    private Date fechaNacimiento;
    private String celular;
    
    public ReservaPaquete tieneReservaPaquete;
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    public String Consultar(){
        return "No se ha implementado este metodo";
    }
    public String Cotizar(){
        return "No se ha implementado este metodo";
    }
    public String TomarDecisiones(){
        return "No se ha implementado este metodo";
    }
    public String RealizarPedido(){
        return "No se ha implementado este metodo";
    }
    public String CalificarExperiencia(){
        return "No se ha implementado este metodo";
    }            
}
