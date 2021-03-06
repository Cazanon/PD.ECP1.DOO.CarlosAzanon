package es.vehiculos.CarlosAzanon;

import upm.jbb.IO;

public class MainVehiculos {
    
    private VehiculosFactory creadorVehiculos=new VehiculosFactory();
    
    public void añadirVehiculo() {
        String tipoVehiculo=(String)IO.in.select(GestorVehiculos.getGestorVehiculos().getTiposVehiculos(),"Selecciona tipo de Vehiculo");
        int id=IO.in.readInt("Identificador del vehiculo");
        String descripcion=IO.in.readString("Descripcion del vehiculo");
        Vehiculo v=creadorVehiculos.getVehiculo(tipoVehiculo,id,descripcion);
        if(GestorVehiculos.getGestorVehiculos().addVehiculo(v)){
            IO.out.println("Añadido el vehiculo: "+v.toString());
        }else{
            IO.out.println("Error añadiendo el vehiculo, id repetido");
        }
    }
     
    public void consultarVehiculos(){
        IO.out.println(GestorVehiculos.getGestorVehiculos().toString());
    }
    
    public void obtenerAlquiler(){
        int id=IO.in.readInt("Identificador del vehiculo");
        int dias=IO.in.readInt("Numero de dias");
        Vehiculo v=GestorVehiculos.getGestorVehiculos().getVehiculo(id);
        if(v==null){
            IO.out.println("No exite el vehiculo con el identificador dado");
        }else{
            double precioAlquiler=v.obtenerPrecio(dias);
            IO.out.println("Alquiler del Vehiculo: "+v.toString()+"\t >Precio: "+precioAlquiler);
        }
    }

    public static void main(String[] args) {
        IO.in.addController(new MainVehiculos());
    }
    
}
