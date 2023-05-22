/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc19
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc19 {
    public static void main(String[] args) {
        try(Scanner inpt = new Scanner(System.in)) {
            System.out.print("Informe a quantidade inicial da saida de gás em centímetros cubicos: ");
            int gInicial = inpt.nextInt();
            int tF = 1;
            int c = gInicial;

            while ( c < 1000) {
                tF += 1;
                c*=2;
            }
            System.out.printf("Uma áréa de 1000 centimetros cubicos e prenchida em %d segundos",tF ); 
        }
    }
}