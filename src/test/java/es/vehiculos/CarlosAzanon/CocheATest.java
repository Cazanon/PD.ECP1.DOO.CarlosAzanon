package es.vehiculos.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CocheATest {
    private Coche c;

    @Before
    public void before() {
        c = new Coche(1,"test",new CategoriaA());
    }

    @Test
    public void testObtenerPrecio() {
        assertEquals(30,c.obtenerPrecio(3),0.1);
        assertEquals(38,c.obtenerPrecio(4),0.1);
        assertEquals(62,c.obtenerPrecio(7),0.1);
        assertEquals(72,c.obtenerPrecio(9),0.1);
    }
    
}
