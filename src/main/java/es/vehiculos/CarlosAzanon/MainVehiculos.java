package es.vehiculos.CarlosAzanon;

import upm.jbb.IO;

public class MainVehiculos {
    
    private GestorVehiculos gestor=new GestorVehiculos();
    
    public void añadirVehiculo() {
        String tipoVehiculo=(String)IO.in.select(gestor.getTiposVehiculos(),"Selecciona tipo de Vehiculo");
        int id=IO.in.readInt("Identificador del vehiculo");
        String descripcion=IO.in.readString("Descripcion del vehiculo");
        gestor.a
    }
     
    public void consultarVehiculos(){
        IO.out.println(gestor.toString());
    }
    
    public void obtenerAlquiler(){
        
    }

    public static void main(String[] args) {
        IO.in.addController(new MainVehiculos());
    }
    
}
