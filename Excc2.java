/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc2
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1 numero:");
        int n1 = input.nextInt();
        System.out.print("Digite o 2 numero:");
        int n2 = input.nextInt();
        System.out.print("Digite o 3 numero:");
        int n3 = input.nextInt();
        input.close();

        if (n1>=n2 & n1>n3) {
            if (n2>=n3) {
                System.out.printf("A ordem crescente dos numeros é %s, %s, %s", n3, n2, n1);
            }
            else {
                System.out.printf("A ordem crescente dos numeros é %s, %s, %s", n2, n3, n1);
            }
        }
        else if (n2>=n3 & n2>n1) {
            if (n1>=n3) {
                System.out.printf("A ordem crescente dos numeros é %s, %s, %s", n3, n1, n2);
            }
            else {
                System.out.printf("A ordem crescente dos numeros é %s, %s, %s", n1, n3, n2);
            }
        } 
        else {
            if (n2>=n1) {
                System.out.printf("A ordem crescente dos numeros é %s, %s, %s", n1, n2, n3);
            }
            else {
                System.out.printf("A ordem crescente dos numeros é %s, %s, %s", n2, n1, n3);
            }
        }
    }
}