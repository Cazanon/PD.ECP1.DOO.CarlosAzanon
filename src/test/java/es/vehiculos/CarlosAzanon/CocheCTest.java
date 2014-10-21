package es.vehiculos.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CocheCTest {
    private Coche c;

    @Before
    public void before() {
        c = new Coche(1,"test",new CategoriaC());
    }

    @Test
    public void testObtenerPrecio() {
        assertEquals(60,c.obtenerPrecio(3),0.1);
        assertEquals(76,c.obtenerPrecio(4),0.1);
        assertEquals(124,c.obtenerPrecio(7),0.1);
        assertEquals(144,c.obtenerPrecio(9),0.1);
    }
    
}
