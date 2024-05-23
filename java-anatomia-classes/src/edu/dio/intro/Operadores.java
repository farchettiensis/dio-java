package edu.dio.intro;

public class Operadores {
    public static void main(String[] args) {
        /*
         * String concatenacao = "?";
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * 
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + 1;
         * 
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + "1";
         * 
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + 1 + 1 + 1;
         * 
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * 
         * System.out.println(concatenacao);
         */

        /*
         * int a, b;
         * a = 5;
         * b = 6;
         * String resultado = a == b ? "verdadeiro" : "falso";
         * System.out.println(resultado);
         */

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        String nomeUm = "Pedro";
        String nomeDois = new String("Pedro");
        System.out.println(nomeUm.equals(nomeDois));
    }
}
