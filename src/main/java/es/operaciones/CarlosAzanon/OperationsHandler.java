package es.operaciones.CarlosAzanon;

import java.util.ArrayList;

public class OperationsHandler {
    
    private ArrayList<Operation> operaciones=new ArrayList<Operation>();
    
    public void add(Operation operacion){
        operaciones.add(operacion);
    }
    
    public double total(){
        double total=0;
        for(Operation operacion : operaciones){
            total+=operacion.calcular();
        }
        return total;
    }
    
    public void reset() {
        operaciones.clear();
    }
    
}
