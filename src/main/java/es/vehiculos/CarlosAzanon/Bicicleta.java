package es.vehiculos.CarlosAzanon;

public class Bicicleta extends Vehiculo{

    private final int PRECIO_RANGO_1=3;
    private final int PRECIO_RANGO_2=2;
    
    private final int MAX_DIAS_RANGO_1=2;
    
    public Bicicleta(int id, String descripcion) {
        super(id, descripcion);
    }
    
    @Override
    public double obtenerPrecio(int dias) {        
        int precio=0;        
        if(dias<=MAX_DIAS_RANGO_1){
            precio=dias*PRECIO_RANGO_1;
        }else if(dias>MAX_DIAS_RANGO_1){
            precio=MAX_DIAS_RANGO_1*PRECIO_RANGO_1;
            precio+=(dias-MAX_DIAS_RANGO_1)*PRECIO_RANGO_2;   
        }else{
            assert false : "Numero de dias incorrecto";
        }        
        return precio;
    }

    @Override
    public String toString() {
        return "Tipo: "+this.getClass().getSimpleName()+"\tId: "+getId()+"\tDescripcion: "+getDescripcion()+"\n";
    }

}
