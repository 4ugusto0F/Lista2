/* 
* Nome do Aluno:    Augusto de Souza Santos
* RA:               722314266
* Nome do Programa: Excc3
* Data:             17/05/2023
*/
package Augusto;

import java.util.Scanner;

public class Excc3 {
    public static void main(String[] args) {
        try( Scanner inpt = new Scanner(System.in) ) {

            System.out.print("\n    ||------É MULTIPLO ?------|| \n\n[[ X é multiplo de Y ?]] Digite X: ");
            Float n1 = inpt.nextFloat();
            System.out.printf("[[ %.1f é multiplo de Y ?]] Digite Y: ",n1);
            Float n2 = inpt.nextFloat();

            String resposta = n1%n2 == 0? "é multiplo":"não é multiplo";

            System.out.printf("\n\n     [[ %.0f %s de %.0f ]]",n1 ,resposta, n2);
        }
    }
}
