package desafioCapgemini.questoes;

import java.util.ArrayList;

import static desafioCapgemini.util.UtilityMethods.preencheString;

public class Questao01 {

    static ArrayList<String> geraEscada(int input){
        ArrayList<String> retVal = new ArrayList<>();
        for(int i = 1; i <= input; i++){
            String escada = "";
            String filler = "";
            escada = preencheString(i, escada, '*');
            filler = preencheString(input - i, filler, ' ');
            retVal.add(filler + escada);
        }
        return retVal;
    }

    public static boolean imprimeResposta(int input){
        if(input == 0){
            return false;
        }else{
            ArrayList<String> retVal = geraEscada(input);
            retVal.forEach(System.out::println);
            return true;
        }
    }
}
