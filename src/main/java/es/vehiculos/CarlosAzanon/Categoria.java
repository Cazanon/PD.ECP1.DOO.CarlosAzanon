package es.vehiculos.CarlosAzanon;

public abstract class Categoria {
    
    public final int PRECIO_CATEGORIA_A=10;
    public final int PRECIO_CATEGORIA_B=15;
    public final int PRECIO_CATEGORIA_C=20;
    
    private int precio;
    
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }

}
