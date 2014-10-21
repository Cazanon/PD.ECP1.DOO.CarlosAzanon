package es.vehiculos.CarlosAzanon;

public class VehiculosFactory {

    public Vehiculo getVehiculo(String tipoVehiculo, int id, String descripcion) {
        if(tipoVehiculo.equals("Coche A")){
            return new Coche(id,descripcion,new CategoriaA());
        }else if(tipoVehiculo.equals("Coche B")){
            return new Coche(id,descripcion,new CategoriaB());
        }else if(tipoVehiculo.equals("Coche C")){
            return new Coche(id,descripcion,new CategoriaC());
        }else if(tipoVehiculo.equals("Moto")){
            return new Moto(id,descripcion);
        }else if(tipoVehiculo.equals("Bicicleta")){
            return new Bicicleta(id,descripcion);
        }else{
            assert false : "No existe el tipo de Vehiculo";
        }
        return null;
    }
    
}
