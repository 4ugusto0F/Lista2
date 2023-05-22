/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc1
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite um numero:");
        int n1 = input.nextInt();
        System.out.print("\nDigite outro numero:");
        int n2 = input.nextInt();
        input.close();

        int maiorN = n1>=n2? n1:n2;
        System.out.printf("\nO maior numero é %s \n \n",maiorN);

    }
}