package es.operaciones.CarlosAzanon;

public class Main {

    public static void main(String[] args) {
    	
        OperationsHandler operations = new OperationsHandler();
        operations.add(new Summation(3, 4));
        System.out.println("Total 1: " + operations.toString() + operations.total());

        operations.add(new Subtraction(1, 1));
        operations.add(new Summation(3, 5));
        operations.add(new Subtraction(4, 1));
        operations.add(new Summation(3, 6));
        operations.add(new Subtraction(3, 2));
        System.out.println("Total 2: " + operations.toString() + operations.total());
        
        operations.add(new Multiplication(6,2));        
        System.out.println("Total 3: " + operations.toString() + operations.total());
    }

}
