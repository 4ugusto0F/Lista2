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

            System.out.print(" ]-----TABUADA------[ \n Digite um numéro: ");
            int n = inpt.nextInt();

            for (int c = 1 ; c <= n ;c++) {
                System.out.println("\n]-----TABUADA------[ \n ]------DO " + c + "------[");
                for ( int t = 1 ; t<=10; t++) {
                    System.out.println(c+" x "+t+" = "+(c*t));
                }
            }
        }
    }
}