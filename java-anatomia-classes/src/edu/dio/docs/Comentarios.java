package edu.dio.docs;

public class Comentarios {
    public static void main(String[] args) {
    }

    /**
     * Documentação
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // 'r' é igual ao resultado
        if (m == "M") { // 'M' = multiplicação
            r = n * x;
        } else {
            // se não, realiza a soma
            r = n + x;
        }
        return r;
    }
}
