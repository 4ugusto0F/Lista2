/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc21
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc21 {
    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in)) {

            System.out.print(" ]-----TABUADA------[ \n\n Digite um numéro: ");
            int n = inpt.nextInt();
            System.out.println("Deseja tabuada de que? \n\n|| [1]SOMA || || [2]SUBTRAÇÃO || || [3]MULTIPLICAÇÃO|| || [4]DIVISÃO ||");
            int escolha = inpt.nextInt();

            switch (escolha) {
                case 1 :
                    System.out.println("\n\n  [--SOMA--]");
                    for ( int c = 1; c <=n ;c++){
                        int soma = n + c; 
                        System.out.printf(" %d + %d = %d\n\n", n, c, soma);

                    }
                    break;

                case 2 :
                    System.out.println("\n\n  [--SUBTRAÇÃO--]");
                    for ( int c = 1; c <=n ;c++){
                        int subtracao = n - c; 
                        System.out.printf(" %d - %d = %d\n\n", n, c, subtracao);    
                    }
                    break;

                case 3 :
                    System.out.println("\n\n  [--MULTIPLICAÇÃO--]");
                    for ( int c = 1; c <=n ;c++){
                        int multiplicacao = n * c; 
                        System.out.printf(" %d x %d = %d\n\n", n, c, multiplicacao);
                    }
                    break;

                case 4 :
                    System.out.println("\n\n  [--DIVISÃO--]");
                    for ( int c = 1; c <=n ;c++){
                        int divisao = n / c; 
                        System.out.printf(" %d / %d = %d\n\n", n, c, divisao);
                    }
                    break;
            }
        }
    }

}