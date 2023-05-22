/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc17
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc17 {
    public static void main(String[] args) {
        try(Scanner inpt = new Scanner(System.in)){

            int n = -1000;

            System.out.printf("\nOs numeros que são Pares dentro do numero %d são: ",n);
            do{
                if (n % 7 == 0) {
                    System.out.printf("\n%d",n);
                }
                n++;
            } while (n<=0);
        }
    }
}