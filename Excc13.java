/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc13
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc13 {
    public static void main(String[] args) {
     
        try(Scanner inpt = new Scanner(System.in)){

            System.out.print("Digite um numero:");
            int n = inpt.nextInt();
            //caso deseje que o numero seja 100 e so apagar a entrada e usar a linha abaixo
            //int n = 100;
            int c = 0;
            int valorS = 0;
            while (c<=n) {
                valorS += c;
                c++;
            }
            System.out.printf("\nO valor da soma dos numeros correspondente ao numero %d = %d \n \n [EX:do numero 5 é 1+2+3+4+5 = 15] \n",n ,valorS);
        }
    }   
}