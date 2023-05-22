/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc18
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc18 {
    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in)) {

            System.out.print(" ]-----FATORIAL------[ \n\n Digite um numéro: ");
            int n = inpt.nextInt();
            int f = 1;
            for ( int c = n; c >=1 ;c--){
                f *= c;
                System.out.printf(" %s x", c);
            }
            System.out.printf("\n\n O fatorial de %d e %d \n\n",n ,f);
        }
    }
}
