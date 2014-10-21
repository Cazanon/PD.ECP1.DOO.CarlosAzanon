package es.vehiculos.CarlosAzanon;

public class Coche extends Vehiculo {

    private final double PORCENTAJE_RANGO_1=100;
    private final double PORCENTAJE_RANGO_2=80;
    private final double PORCENTAJE_RANGO_3=50;
    
    private final int MAX_DIAS_RANGO_1=3;
    private final int MAX_DIAS_RANGO_2=7;
    
    private Categoria categoria;
    
    public Coche(int id, String descripcion, Categoria categoria) {
        super(id, descripcion);
        this.categoria=categoria;
    }

    @Override
    public double obtenerPrecio(int dias) {        
        double precio=0;   
        if(dias<=MAX_DIAS_RANGO_1){
            precio=dias*(PORCENTAJE_RANGO_1/100)*categoria.getPrecio();
        }else if(dias>MAX_DIAS_RANGO_1 && dias<=MAX_DIAS_RANGO_2){
            precio=MAX_DIAS_RANGO_1*(PORCENTAJE_RANGO_1/100)*categoria.getPrecio(); 
            precio+=(dias-MAX_DIAS_RANGO_1)*(PORCENTAJE_RANGO_2/100)*categoria.getPrecio();
        }else if(dias>MAX_DIAS_RANGO_2){
            precio=MAX_DIAS_RANGO_1*(PORCENTAJE_RANGO_1/100)*categoria.getPrecio(); 
            precio+=(MAX_DIAS_RANGO_2-MAX_DIAS_RANGO_1)*(PORCENTAJE_RANGO_2/100)*categoria.getPrecio();
            precio+=(dias-MAX_DIAS_RANGO_2)*(PORCENTAJE_RANGO_3/100)*categoria.getPrecio();
        }else{
            assert false : "Numero de dias incorrecto";
        }        
        return precio;
    }
    
    @Override
    public String toString() {
        return "Tipo: "+this.getClass().getSimpleName()+"\tId: "+getId()+"\tDescripcion: "+getDescripcion()+"\tCategoria: "+
                categoria.getClass().getSimpleName()+"\n";
    }

}
