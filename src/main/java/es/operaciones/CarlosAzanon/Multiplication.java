package es.operaciones.CarlosAzanon;

public class Multiplication extends Operation{
    
    private final int operator1, operator2;

    public Multiplication(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public int multiplicar() {
        return this.operator1 * this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "*" + operator2 + "]";
    }

    @Override
    public double calcular() {
        // TODO Auto-generated method stub
        return 0;
    }

}
