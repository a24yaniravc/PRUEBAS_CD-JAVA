public class Factorial {
    public float factorial(byte n) throws Exception {
        
        if (n < 0) {
            throw new Exception("Erro. O número ten que ser >=0");
        }
        
        float resultado = 1;
        
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}