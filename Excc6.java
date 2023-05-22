/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc6
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nQual a nota do aluno? ");
        int nota = input.nextInt();
        input.close();

        if (nota<=49) {
            System.out.printf("\nA nota avaliada em %d é dada como INSUFICIENTE",nota);
        }
        else if (nota<=64) {
            System.out.printf("\nA nota avaliada em %d é dada como REGULAR",nota);
        }
        else if (nota<=84) {
                System.out.printf("\nA nota avaliada em %d é dada como BOM",nota);
        }
        else if (nota<=100){
            System.out.printf("\nA nota avaliada em %d é dada como ÓTIMO",nota);
        }
    }
}