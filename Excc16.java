/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc16
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc16 {
    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in)){
            int cc = 0;
            System.out.print("\n[ Digite um numero menor que 0 para Parar ]\n");
            while ( cc != 1) {
                System.out.print("Digite um numero: ");
                int n = inpt.nextInt();

                System.out.print("\n[ Digite um numero menor que 0 para Parar ]\n");
                if ( n < 0 ) {
                    break;
                }
            }
            System.out.println("\n Obrigado por utilizar nossos serviço \n \n");
        }
    }
}