package desafioCapgemini.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import static desafioCapgemini.util.UtilityMethods.*;

public class Questao02 {

    public static HashMap<Integer, Integer> encontraPares(ArrayList<Integer> input){
        HashMap<Integer, Integer> retVal = new HashMap<>();
        if(input != null){
            if(!input.isEmpty()){
                if(input.size() > 1){
                    if(input.size() > 2){
                        int cmp = input.get(input.size() - 1);
                        input = new ArrayList<>(new LinkedHashSet<>(input));
                        input.sort(Collections.reverseOrder());
                        for(int i = 0; i < input.size(); i++){
                            int a = input.get(i);
                            for(int j = i; j < input.size(); j++){
                                int b = input.get(j);
                                if(a - b == cmp){
                                    retVal.put(a,b);
                                }
                            }
                        }
                    }else{
                        if(input.get(0) == 2*input.get(1)){
                            HashMap<Integer, Integer> par = new HashMap<>();
                            retVal.put(input.get(0),input.get(1));
                        }
                    }
                }else{
                    System.out.println("|| ===> Apenas um membro presente, nao ha pares");
                }
            }else{
                System.out.println("|| ====> Entrada invalida");
            }
        }
        return retVal;
    }

    public static void q2ImprimeResultado(String input) {
        if(input != null && !(input.equals(""))){
            String pattern = "\\[([0-9,\\s]*?)\\]";
            input = inputPreprocessor(input, pattern, 1);
            System.out.println(input);
        }else{
            System.out.println("| ===> Entrada invalida");
        }
    }
}
