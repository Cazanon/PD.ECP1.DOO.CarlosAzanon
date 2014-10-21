package es.vehiculos.CarlosAzanon;

public abstract class Vehiculo {

    private int id;
    private String descripcion;
    
    public Vehiculo(int id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
     
    public abstract double obtenerPrecio(int dias);
    
    @Override
    public String toString() {
        return "Tipo: "+this.getClass().getSimpleName()+"\tId: "+getId()+"\tDescripcion: "+getDescripcion()+"\n";
    }
    
}
