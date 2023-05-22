/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc9
* Data:             19/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc9 {
    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in);){
            System.out.println("Qual o valor do item vendido?");
            float valor = inpt.nextFloat();
            System.out.println("Escolha a forma de pagamento \n|[1]A vista| |[2]A prazo| |[3]No cartão| ");
            int formaP = inpt.nextInt();
            switch (formaP) {
                case 1: 
                    float valorA = (float) (valor - (valor * 0.1));
                    System.out.printf("O valor a vista fica %.2f Reais.",valorA);
                    break;
                case 2:
                    System.out.println("A prazo temos essas opções \n|[1]30 dias| |[2]60 dias| |[3]90 dias|");
                    int prazo = inpt.nextInt();
                    switch (prazo) {
                        case 1:
                            float valorP = (float) (valor - (valor * 0.05));
                            System.out.printf("O valor a prazo de 30 dias fica %.2f Reais.",valorP);
                            break;
                        case 2:
                            System.out.printf("O valor a prazo de 60 dias fica %.2f Reais.",valor);
                            break;
                        case 3:
                            float valorP1 = (float) (valor + (valor * 0.05));
                            System.out.printf("O valor a prazo de de 90 dias fica %.2f Reais.",valorP1);
                            break;
                        default:
                            System.out.println("Opção invalida, por favor tente novamente");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("|[1]Debito| |[2]Credito| ");
                    int cartao = inpt.nextInt();
                    switch (cartao) {
                        case 1:
                            float valorC = (float) (valor - (valor * 0.08));
                            System.out.printf("O valor no cartao de debito fica %.2f Reais.",valorC);
                            break;
                        case 2:
                            float valorC1 = (float) (valor - (valor * 0.07));
                            System.out.printf("O valor no cartao de debito fica %.2f Reais.",valorC1);
                            break;
                        default:
                            System.out.println("Opção invalida, por favor tente novamente");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção invalida, por favor tente novamente");
                    break;
            }
        }
    }
}