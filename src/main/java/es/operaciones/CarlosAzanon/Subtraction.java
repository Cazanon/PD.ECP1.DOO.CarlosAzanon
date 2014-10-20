package es.operaciones.CarlosAzanon;

public class Subtraction extends Operation{

    public Subtraction(double operator1,double operator2) {
        super(operator1,operator2);
    }

    @Override
    public double calcular() {
        return getOperador1()-getOperador2();
    }

    @Override
    public String toString() {
        return "[" + getOperador1() + "-" + getOperador2() + "]";
    }    

}
