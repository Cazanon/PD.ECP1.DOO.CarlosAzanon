package es.operaciones.CarlosAzanon;

public abstract class Operation {
    
    private double operador1;
    private double operador2;
    
    public abstract double calcular();
    
    public abstract String toString();
    
    public double getOperador1(){
        return operador1;
    }
    
    public double getOperador2(){
        return operador2;
    }
    
}
