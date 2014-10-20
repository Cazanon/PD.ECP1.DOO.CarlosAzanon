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
    
    @Override
    public String toString() {
        String secuencia="";
        for(Operation op : operaciones){
            secuencia+=op.toString()+"+";
        }
        secuencia+=" >>>";
        return secuencia;
    }
    
}
