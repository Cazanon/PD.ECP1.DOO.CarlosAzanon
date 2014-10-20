package es.operaciones.CarlosAzanon;

public abstract class Operation {
    
    private int operador1;
    private int operador2;
    
    public Operation(int op1,int op2){
        operador1=op1;
        operador2=op2;
    }
    
    public abstract int calcular();
    
    public abstract String toString();
    
    public int getOperador1(){
        return operador1;
    }
    
    public int getOperador2(){
        return operador2;
    }
    
}
