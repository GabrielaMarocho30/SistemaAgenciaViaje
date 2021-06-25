package capaNegocio;

public class Proveedor {

    public Proveedor() {   
        this.datosProveedorTransporteTerrestre = "";
        this.datosProveedorTransporteAereo = "";
        this.datosProveedorHotel = "";
        this.datosProveedorRestaurantes = "";
        this.datosProveedorGuías = "";
    }

    public Proveedor(String datosProveedorTransporteTerrestre, String datosProveedorTransporteAereo, String datosProveedorHotel, String datosProveedorRestaurantes, String datosProveedorGuías) {
        this.datosProveedorTransporteTerrestre = datosProveedorTransporteTerrestre;
        this.datosProveedorTransporteAereo = datosProveedorTransporteAereo;
        this.datosProveedorHotel = datosProveedorHotel;
        this.datosProveedorRestaurantes = datosProveedorRestaurantes;
        this.datosProveedorGuías = datosProveedorGuías;
    }
    
    private String datosProveedorTransporteTerrestre;
    private String datosProveedorTransporteAereo;
    private String datosProveedorHotel;
    private String datosProveedorRestaurantes;
    private String datosProveedorGuías;
    
    public Paquete ofrecePaquete;

    public String getDatosProveedorTransporteTerrestre() {
        return datosProveedorTransporteTerrestre;
    }

    public void setDatosProveedorTransporteTerrestre(String datosProveedorTransporteTerrestre) {
        this.datosProveedorTransporteTerrestre = datosProveedorTransporteTerrestre;
    }

    public String getDatosProveedorTransporteAereo() {
        return datosProveedorTransporteAereo;
    }

    public void setDatosProveedorTransporteAereo(String datosProveedorTransporteAereo) {
        this.datosProveedorTransporteAereo = datosProveedorTransporteAereo;
    }

    public String getDatosProveedorHotel() {
        return datosProveedorHotel;
    }

    public void setDatosProveedorHotel(String datosProveedorHotel) {
        this.datosProveedorHotel = datosProveedorHotel;
    }

    public String getDatosProveedorRestaurantes() {
        return datosProveedorRestaurantes;
    }

    public void setDatosProveedorRestaurantes(String datosProveedorRestaurantes) {
        this.datosProveedorRestaurantes = datosProveedorRestaurantes;
    }

    public String getDatosProveedorGuías() {
        return datosProveedorGuías;
    }

    public void setDatosProveedorGuías(String datosProveedorGuías) {
        this.datosProveedorGuías = datosProveedorGuías;
    }
    
    private String RegistrarServicio(){
        return "El método no se ha implementado";
    }
    private String CobrarTrifa (){
        return "El método no se ha implementado";
    }
}
