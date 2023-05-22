/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc8
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc8 {
    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in);){
            System.out.println("Digite um numero do mês que você deseja saber [1 a 12]:");
            int nMes = inpt.nextInt();
            switch (nMes) {
                case 1 :
                    System.out.println("\nMês 1 é Janeiro a estação no brasil é Verão.\n \n");
                    break;
                case 2 :
                    System.out.println("\nMês 2 é Fevereiro a estação no brasil é Verão.\n \n");
                    break;
                case 3 :
                    System.out.println("\nMês 3 é Maio a estação no brasil é Outono.\n \n");
                    break;
                case 4 :
                    System.out.println("\nMês 4 é Abril a estação no brasil é Outono.\n \n");
                    break;
                case 5 : 
                    System.out.println("\nMês 5 é Março a estação no brasil é Outono.\n \n");
                    break;
                case 6 :
                    System.out.println("\nMês 6 é Junho a estação no brasil é Inverno.\n \n");
                    break;
                case 7 :
                    System.out.println("\nMês 7 é Julho a estação no brasil é Inverno\n \n");
                    break;
                case 8 :
                    System.out.println("\nMês 8 é Agosto a estação no brasil é Inverno\n \n");
                    break;
                case 9 :
                    System.out.println("\nMês 9 é Setembro a estação no brasil é Primavera\n \n");
                    break;
                case 10 :
                    System.out.println("\nMês 10 é Outubro a estação no brasil é Primavera\n \n");
                    break;
                case 11 :
                    System.out.println("\nMês 11 é Novembro a estação no brasil é Primavera\n \n");
                    break;
                case 12 :
                    System.out.println("\nMês 12 é Dezembro a estação no brasil é Verão.\n \n");
                    break;
                default:
                    System.out.println("\nA mensagem digitada e invalida, escolha um numero de 1 a 12");
                    break;
            }
        }
    }
}