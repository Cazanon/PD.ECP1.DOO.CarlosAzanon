package es.vehiculos.CarlosAzanon;

import java.util.ArrayList;

public class GestorVehiculos {

    private static GestorVehiculos gestorVehiculos;    
    
    private ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
    private String[] tiposVehiculos = {"Coche A","Coche B","Coche C","Moto","Bicicleta"}; 
    
    private GestorVehiculos(){
    }
    
    public static GestorVehiculos getGestorVehiculos(){
        if (GestorVehiculos.gestorVehiculos == null) {
            GestorVehiculos.gestorVehiculos = new GestorVehiculos();
        }
        return GestorVehiculos.gestorVehiculos;
    }
    
    public boolean addVehiculo(Vehiculo vehiculo){
        for(Vehiculo v : vehiculos){
            if(v.getId()==vehiculo.getId()){
                return false;
            }
        }
        vehiculos.add(vehiculo);
        return true;
    }
    
    public String[] getTiposVehiculos(){
        return tiposVehiculos;        
    }
    
    @Override
    public String toString(){
        String cadena="";
        for(Vehiculo v : vehiculos){
            cadena+=v.toString();
        }
        return cadena;
    }

    public Vehiculo getVehiculo(int id) {
        for(Vehiculo v : vehiculos){
            if(v.getId()==id){
                return v;
            }
        }
        return null;
    }
    
}
