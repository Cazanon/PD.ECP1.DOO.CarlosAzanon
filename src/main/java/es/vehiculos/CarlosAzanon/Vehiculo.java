package es.vehiculos.CarlosAzanon;

public abstract class Vehiculo {

    private int id;
    private String descripcion;
    
    public Vehiculo(int id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
    }
    
}
