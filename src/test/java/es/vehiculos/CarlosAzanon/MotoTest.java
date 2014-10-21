package es.vehiculos.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MotoTest {
    private Moto m;

    @Before
    public void before() {
        m = new Moto(1,"test");
    }

    @Test
    public void testObtenerPrecio() {
        assertEquals(16,m.obtenerPrecio(2),0.1);
        assertEquals(56,m.obtenerPrecio(7),0.1);
        assertEquals(63,m.obtenerPrecio(9),0.1);
    }
    
}
