package es.vehiculos.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {
    private Bicicleta b;

    @Before
    public void before() {
        b = new Bicicleta(1,"test");
    }

    @Test
    public void testObtenerPrecio() {
        assertEquals(6,b.obtenerPrecio(2),0.1);
        assertEquals(10,b.obtenerPrecio(4),0.1);
    }
    
}
