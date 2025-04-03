public class ComprobarPrimo {
    private int numero;
 
    public ComprobarPrimo(int numero) {
        this.numero = numero;
    }
 
    public boolean ePrimo() {
        for (int n = 2; n * n < numero; n++) {
            if (numero % n == 0) {
                return false;
            }
        }
        return true;
    }
}    