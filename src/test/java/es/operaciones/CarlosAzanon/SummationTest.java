package es.operaciones.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SummationTest {
    private Summation s;

    @Before
    public void before() {
        s = new Summation(2, 3);
    }

    @Test
    public void testCalcular() {
        assertEquals(5, s.calcular());
    }
    
}
