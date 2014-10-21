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
        assertEquals(20,c.obtenerPrecio(2),0.1);
    }
    
}
