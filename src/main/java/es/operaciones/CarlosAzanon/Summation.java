package es.operaciones.CarlosAzanon;

public class Summation extends Operation{

    public Summation(double operator1,double operator2) {
        super(operator1,operator2);
    }

    @Override
    public double calcular() {
        return getOperador1()+getOperador2();
    }

    @Override
    public String toString() {
        return "[" + getOperador1() + "+" + getOperador2() + "]";
    }
    
}
