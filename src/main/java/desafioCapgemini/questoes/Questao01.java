package desafioCapgemini.questoes;

import java.util.ArrayList;

import static desafioCapgemini.util.UtilityMethods.preencheString;

public class Questao01 {

    //geraEscada eha funcao responsavel por imprimir a escada invertida
    //@param input - Numero de linhas
    //@return retVal - ArrayList de Strings com a linhas geradas
    static ArrayList<String> geraEscada(int input){
        ArrayList<String> retVal = new ArrayList<>();
        if(input != 0){
            for(int i = 1; i <= input; i++){
                String escada = "";
                String filler = "";
                escada = preencheString(i, escada, '*');
                filler = preencheString(input - i, filler, ' ');
                retVal.add(filler + escada);
            }
        }
        return retVal;
    }

    public static void q1ImprimeResultado(int input){
        if(input != 0){
            ArrayList<String> retVal = geraEscada(input);
            retVal.forEach(System.out::println);
        }
    }
}
