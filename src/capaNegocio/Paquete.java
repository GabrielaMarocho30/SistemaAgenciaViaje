package capaNegocio;

import java.util.ArrayList;

public class Paquete {

    public Paquete() {
        this.destino = "";
        this.nombrePaquete = "";
        this.costo = 0.0;
        this.vuelos = "";
        this.actividades = "";
        this.descripcion = "";
        this.hotelesDisponibles = "";
    }

    public Paquete(String destino, String nombrePaquete, Double costo, String vuelos, String actividades, String descripcion, String hotelesDisponibles) {
        this.destino = destino;
        this.nombrePaquete = nombrePaquete;
        this.costo = costo;
        this.vuelos = vuelos;
        this.actividades = actividades;
        this.descripcion = descripcion;
        this.hotelesDisponibles = hotelesDisponibles;
    }
    
    private String destino;
    private String nombrePaquete;
    private Double costo;
    private String vuelos;
    private String actividades;
    private String descripcion;
    private String hotelesDisponibles; 
    
    public ReservaPaquete realizarReserva;
    public ArrayList <Proveedor> listaPaquete = new ArrayList(); 
    public Encargado correspondeEncargado; 
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getVuelos() {
        return vuelos;
    }

    public void setVuelos(String vuelos) {
        this.vuelos = vuelos;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHotelesDisponibles() {
        return hotelesDisponibles;
    }

    public void setHotelesDisponibles(String hotelesDisponibles) {
        this.hotelesDisponibles = hotelesDisponibles;
    }
    private String InformarCliente(){
        return "No se ha implementado";
    }
}
