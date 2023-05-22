/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc20
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc20 {
    public static void main (String[] args) {
        try ( Scanner inpt = new Scanner(System.in)) {

            System.out.print("\n-------ELEVADOR-------\n\n Qual a carga maxima do elevador em kg: ");
            double kgMax = inpt.nextDouble();
            double kgSomado = 0;

            System.out.print("Qual o limite maximo de pessoas no elevador: ");
            int pssMax = inpt.nextInt();
            int pssIndividual = 0;

            do {
                System.out.print("Qual o peso da pessoa que acabou de entrar no elevador? ");
                double kgIndividual = inpt.nextDouble();
                kgSomado += kgIndividual;
                pssIndividual += 1;

            } while (kgSomado < kgMax && pssIndividual < pssMax);

            System.out.println("[ O máximo de pessoas ou de peso chegou ao limite! ]");
        }
    }
}