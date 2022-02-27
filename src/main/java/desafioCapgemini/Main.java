package desafioCapgemini;

import java.util.Scanner;

import static desafioCapgemini.questoes.Questao01.q1ImprimeResultado;
import static desafioCapgemini.questoes.Questao02.q2ImprimeResultado;
import static desafioCapgemini.questoes.Questao03.q3ImprimeResultado;
import static desafioCapgemini.util.UtilityMethods.inputParser;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sel = 1;
        while(sel != 0){

            System.out.println("|| ======== Desafio Capgemini 2022 ======== ||");
            System.out.println("|| ===> Questao 1 - Escada invertida ====== ||");
            System.out.println("|| ===> Questao 2 - Verificacao de senha == ||");
            System.out.println("|| ===> Questao 3 - Contagem de anagramas = ||");
            System.out.println("|| ======================================== ||");
            System.out.print("|| ===> Insira o numero da questao ou \"0\" para sair: "); sel = inputParser(scan);

            switch (sel){
                case 0:
                    System.out.println("|| ===> Saindo do programa");
                    break;
                case 1:
                    System.out.print("|| ===> Insira o numero de linhas:"); q1ImprimeResultado(inputParser(scan));
                    break;
                case 2:
                    System.out.print("|| ===> Insira a senha desejada:"); q2ImprimeResultado(scan.nextLine(), 0);
                    break;
                case 3:
                    System.out.print("|| ===> Insira a palavra desejada:"); q3ImprimeResultado(scan.nextLine(), 1);
                    break;
                default:
                    System.out.println("|| ===> Entrada invalida");
                    break;
            }

        }
    }
}
