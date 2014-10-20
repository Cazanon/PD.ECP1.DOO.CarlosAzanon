package es.operaciones.CarlosAzanon;

public class Multiplication extends Operation{
    
    public Multiplication(int operator1,int operator2) {
        super(operator1,operator2);
    }

    @Override
    public int calcular() {
        return getOperador1()*getOperador2();
    }

    @Override
    public String toString() {
        return "[" + getOperador1() + "*" + getOperador2() + "]";
    }    

}
