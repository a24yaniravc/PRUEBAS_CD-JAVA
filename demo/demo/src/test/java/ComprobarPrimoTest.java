import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComprobarPrimoTest {
    @Test
    void testEPrimo() {
        ComprobarPrimo comprobarPrimo = new ComprobarPrimo(7);
        assertEquals(true, comprobarPrimo.ePrimo()); 
    }

    @Test
    void testNoEPrimo() {
        ComprobarPrimo comprobarPrimo = new ComprobarPrimo(8);
        assertEquals(false, comprobarPrimo.ePrimo()); 
    }

    @Test
    void testNoEPrimo2() {
        ComprobarPrimo comprobarPrimo = new ComprobarPrimo(2);
        assertEquals(true, comprobarPrimo.ePrimo()); 
    }
}
