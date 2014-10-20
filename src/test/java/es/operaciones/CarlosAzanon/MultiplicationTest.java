package es.operaciones.CarlosAzanon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {
    private Multiplication m;

    @Before
    public void before() {
        m = new Multiplication(2, 3);
    }

    @Test
    public void testCalcular() {
        assertEquals(6, m.calcular());
    }
    
}
