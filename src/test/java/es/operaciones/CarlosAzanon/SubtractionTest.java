package es.operaciones.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {
    private Subtraction s;

    @Before
    public void before() {
        s = new Subtraction(4, 1);
    }

    @Test
    public void testCalcular() {
        assertEquals(3, s.calcular());
    }
    
}
