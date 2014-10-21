package es.vehiculos.CarlosAzanon;

public class Moto extends Vehiculo {
   
    private final int PRECIO_RANGO_1=8;
    private final int PRECIO_RANGO_2=7;
    
    private final int MAX_DIAS_RANGO_1=7;
    
    public Moto(int id, String descripcion) {
        super(id, descripcion);
    }
    
    @Override
    public double obtenerPrecio(int dias) {        
        int precio=0;        
        if(dias<=MAX_DIAS_RANGO_1){
            precio=dias*PRECIO_RANGO_1;
        }else if(dias>MAX_DIAS_RANGO_1){
            precio=dias*PRECIO_RANGO_2; 
        }else{
            assert false : "Numero de dias incorrecto";
        }        
        return precio;
    }
    
}
