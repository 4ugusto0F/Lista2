/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc12
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc12 {
    public static void main(String[] args) {
        try(Scanner inpt = new Scanner(System.in)){

            System.out.print("Digite um numero:");
            int n = inpt.nextInt();
            //caso deseje que o numero seja 100 e so apagar a entrada e usar a linha abaixo
            //int n = 100;
            int c = 1;

            System.out.printf("\nOs numeros que são Pares dentro do numero %d são: ",n);
            do{
                if (c % 2 == 0) {
                    System.out.printf("\n%d",c);
                }
                c++;
            } while (c%7 !=0);
            System.out.println("\n\n[O SISTEMA PARA SE ENCONTRAR UM NUMERO MULTIPLO DE 7]");
        }
    }
}