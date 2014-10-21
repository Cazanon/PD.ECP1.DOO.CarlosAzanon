package es.vehiculos.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CocheBTest {
    private Coche c;

    @Before
    public void before() {
        c = new Coche(1,"test",new CategoriaB());
    }

    @Test
    public void testObtenerPrecio() {
        assertEquals(45,c.obtenerPrecio(3),0.1);
        assertEquals(57,c.obtenerPrecio(4),0.1);
        assertEquals(93,c.obtenerPrecio(7),0.1);
        assertEquals(108,c.obtenerPrecio(9),0.1);
    }
    
}
