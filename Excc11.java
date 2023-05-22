/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc11
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc11 {
    public static void main(String[] args) {
        try(Scanner inpt = new Scanner(System.in)){

            System.out.print("Digite um numero:");
            int n = inpt.nextInt();
            //caso deseje que o numero seja 100 e so apagar a entrada e usar a linha abaixo
            //int n = 100;
            int c = 0;

            System.out.printf("\nOs numeros que são Pares dentro do numero %d são: ",n);

            while (c<n) {

                if (c % 2 == 0) {
                    System.out.printf("\n%d",c);
                }
                c++;
            }
        }
    }
}