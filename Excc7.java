/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc7
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc7 {
    public static void main(String[] args) {

        float valorD = 60.0f;
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Olá quanto tempo deseja ficar hospedado? ");
            int diaria = input.nextInt();

            if (diaria<15) { 
                Float taxa = 8.0f;
                Float valorH = (valorD + taxa) * diaria;
                System.out.printf("\nO valor da hospedagem vai ficar %.2f Reais",valorH);
            }
            else if (diaria==15) {
                Float taxa = 6.0f;
                Float valorH = (valorD + taxa) * diaria;
                System.out.printf("\nO valor da hospedagem vai ficar %.2f Reais",valorH);
            }
            else {
                Float taxa = 5.5f;
                Float valorH = (valorD + taxa) * diaria;
                System.out.printf("\nO valor da hospedagem vai ficar %.2f Reais",valorH);
            }
        }
    }
}