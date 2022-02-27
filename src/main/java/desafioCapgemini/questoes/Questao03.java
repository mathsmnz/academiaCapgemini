package desafioCapgemini.questoes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Questao03 {

    public static HashMap<String, Integer> buscaAnagramas(String input) {
        HashMap<String, Integer> retVal = new HashMap<>();

        if ((!Objects.equals(input, "")) && (input != null)) {

            //Laco de iteracao pela string de entrada
            for (int i = 0; i < input.length(); i++) {
                for (int j = i; j < input.length(); j++) {

                    //cria charArray de uma substring de entrada
                    char[] charArray = input.substring(i, j + 1).toCharArray();

                    //Organiza alfabeticamente charArray, para possibilitar a comparacao
                    Arrays.sort(charArray);

                    String s = new String(charArray);

                    //Tenta adicionar a substring no HashMap, para caso ela ja exista
                    //incrementar o valor da substring ja existente, marcando assim como anagrama
                    if (retVal.containsKey(s))
                        retVal.put(s, retVal.get(s) + 1);
                    else
                        retVal.put(s, 1);
                }
            }

            //Limpa retVal removendo nao anagramas
            retVal.entrySet()
                    .removeIf(
                            entry -> (1 == entry.getValue()));

        }
        return retVal;
    }

    public static void q3ImprimeResultado(String input, int mode){
        if(mode != 0){
            HashMap<String, Integer> resultado = buscaAnagramas(input);
            System.out.println("|| ===> " + resultado);
            System.out.println("|| ==> Tamanho:" + resultado.size());
        }else{
            System.out.println(buscaAnagramas(input).size());
        }
    }
}
