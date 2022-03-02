package desafioCapgemini.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static desafioCapgemini.util.UtilityMethods.*;

public class Questao01 {
    public static int calculaMediana(ArrayList<Integer> input){
        Collections.sort(input);
        if(input.size() % 2 != 0){
            return input.get(input.size() / 2);
        }else{
            int retVal = 0;
            int size = input.size();
            double firstHalf = input.get((size - 1) / 2);
            double secondHalf = input.get(size / 2);
            retVal = (int) Math.round((firstHalf + secondHalf) / 2.0);
            return retVal;
        }
    }

    public static void q1ImprimeResultado(String input) {
        if(input != null && !(input.equals(""))){
            input = inputPreprocessor(input);
            if(!Objects.equals(input, "")){
                ArrayList<Integer> printVal = stringArrayToInteger(inputTokenizer(input));
                if(!printVal.isEmpty()){
                    System.out.println("|| ====> " + calculaMediana(printVal));
                }else{
                    System.out.println("| ===> Erro de processamento");
                }
            }
        }else{
            System.out.println("| ===> Entrada invalida");
        }
    }
}
