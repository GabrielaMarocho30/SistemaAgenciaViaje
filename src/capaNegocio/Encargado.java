package capaNegocio;

import java.util.ArrayList;
import java.util.Date;

public class Encargado {

    public Encargado() {
        this.nombres = "";
        this.apellidos = "";
        this.dni = "";
        this.fechaNacimiento = null;
        this.experiencia = "";
        this.celular = "";
    }

    public Encargado(String nombres, String apellidos, String dni, Date fechaNacimiento, String experiencia, String celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.experiencia = experiencia;
        this.celular = celular;
    }
    
    private String nombres;
    private String apellidos;
    private String dni;
    private Date fechaNacimiento;
    private String experiencia;
    private String celular;
    
    public RegistroVentas ventasRealizadas;
    public Administrador supervisar;
    public ArrayList <Paquete> OfrecePaquetes = new ArrayList();

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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    public String Ofrecer(){
        return "No se ha implementado este metodo";
    }
    public String Registrar(){
        return "No se ha implementado este metodo";
    }
    public String Verificar(){
        return "No se ha implementado este metodo";
    }
}
