/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc4
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numnero:");
        int n1 = input.nextInt();
        
        String respostaPaIm = (n1 % 2 ==0)? "par" : "impar";
        String respostaPoNe = (n1 < 0)? "negativo" : "positivo";
        System.out.println("O numero descrito é " + respostaPaIm + " e " + respostaPoNe);
        input.close();
    }
}