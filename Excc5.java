/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc5
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc5 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Qual o seu Nome? ");
    String nome = input.nextLine();
    System.out.println("E o seu Sobrenome? ");
    String sNome = input.nextLine();
    System.out.println("Agora a sua idade? ");
    String idade = input.nextLine();
    System.out.println("E o ultima pergunta prometo, Naturalidade? ");
    String naturalidade = input.nextLine();

    System.out.println("\nDeseja visualizar os dados completos? [S/N]");
    String escolha = input.next();
    input.close();
        switch (escolha) {

            case "S":
                System.out.printf("\nSr(a) %s %s, %s anos, Natural de %s \n \n",nome ,sNome ,idade ,naturalidade);
                break;

            case "N":
                System.out.printf("\nAté breve %s, %s anos \n \n",nome ,idade);
                break;

            default:
                System.out.println("[Ocorreu um erro na digitação. Tente Novamente]");
                break;
        };
    }
}
