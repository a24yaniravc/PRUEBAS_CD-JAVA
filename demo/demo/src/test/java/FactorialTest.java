import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testFactorialError() throws Exception{
        Factorial facto = new Factorial();
        float resultado = facto.factorial((byte) 5);
        assertEquals(120, resultado); 
    }

    @Test
    void testFactorial0() throws Exception{
        Factorial facto = new Factorial();
        float resultado = facto.factorial((byte) 0);
        assertEquals(1, resultado); 
    }

    @Test
    void testFactorial1() throws Exception{
        Factorial facto = new Factorial();
        assertThrows(Exception.class, () -> facto.factorial((byte) -1)); 
    }
}
