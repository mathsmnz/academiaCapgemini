package desafioCapgemini;

import java.util.Scanner;

import static desafioCapgemini.questoes.Questao01.q1ImprimeResultado;
import static desafioCapgemini.questoes.Questao02.q2ImprimeResultado;
import static desafioCapgemini.questoes.Questao03.q3ImprimeResultado;
import static desafioCapgemini.util.UtilityMethods.inputParser;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sel = 1;
        while (sel != 0) {

            System.out.println("|| ======== Desafio Capgemini 2022 ======== ||");
            System.out.println("|| ===> Questao 1 - Mediana de uma lsita == ||");
            System.out.println("|| ===> Questao 2 - Pares de diferenca ==== ||");
            System.out.println("|| ===> Questao 3 - Criptografia de texto = ||");
            System.out.println("|| ======================================== ||");
            System.out.print("|| ===> Insira o numero da questao ou \"0\" para sair: ");
            sel = inputParser(scan);

            switch (sel) {
                case 0:
                    System.out.println("|| ===> Saindo do programa");
                    break;
                case 1:
                    System.out.print("|| ===> Insira sua entrada:");
                    q1ImprimeResultado(scan.nextLine());
                    break;
                case 2:
                    System.out.print("|| ===> Insira sua entrada:");
                    q2ImprimeResultado(scan.nextLine());
                    break;
                case 3:
                    System.out.print("|| ===> Insira sua entrada:");
                    q3ImprimeResultado(scan.nextLine());
                    break;
                default:
                    System.out.println("|| ===> Entrada invalida");
                    break;
            }

        }
    }
}
