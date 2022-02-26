package desafioCapgemini.questoes;

import java.util.ArrayList;
import java.util.Arrays;

import static desafioCapgemini.util.UtilityMethods.countCharacters;

public class Questao02 {
    static ArrayList<Integer> validaSenha(String input){
        if(input == null){
            return new ArrayList<Integer>();
        }else{
            ArrayList<Integer> retVal = new ArrayList<>(
                    Arrays.asList(
                            1, // Maiusculos que faltam
                            1, // Minusculos que faltam
                            1, // Digitos que faltam
                            1, // Especiais que faltam
                            0, // Tamanho que falta
                            0)); // Total

            int contMin[] = {1, //Contagem de maiusculos
                    1, //Contagem de minusculos
                    1, //Contagem de digitos
                    1};//Contagem de especiais
            int tamMin = 6;

            for(int i = 0; i < 4; i++){
                if(countCharacters(input, i + 1) >= contMin[i]){
                    retVal.set(i,0);
                }
            }

            int c = 0;
            for(int i = 0; i < 4; i++){
                if(retVal.get(i) != 0){
                    c++;
                }
            }

            if(input.length() < tamMin){
                if((input.length() + c) >= tamMin){
                    retVal.set(5,c);
                }else{
                    int newSize = tamMin - (input.length() + c);
                    retVal.set(4,newSize);
                }
            }

            int totalSize = c + retVal.get(4);
            retVal.set(5, totalSize);

            return retVal;
        }
    }

    public static void q2ImprimeResultado(String input, int modo){
        ArrayList<Integer> resultado = validaSenha(input);

        if(modo != 0){
            ArrayList<Boolean> validadores = new ArrayList<>(
                    Arrays.asList(
                            resultado.get(0) < 1,
                            resultado.get(1) < 1,
                            resultado.get(2) < 1,
                            resultado.get(3) < 1,
                            resultado.get(4) < 1
                    ));

            System.out.println("|| ===> Tamanho da senha valido: " + validadores.get(4));
            if(!validadores.get(4)){
                System.out.println("|| ==> Tamanho sugerido: " + resultado.get(4) + "\n");
            }
            System.out.println("|| ===> Contagem digito da senha valido: " + validadores.get(2));
            if(!validadores.get(2)){
                System.out.println("|| ==> Adicionar mais: " + resultado.get(2) + "\n");
            }
            System.out.println("|| ===> Contagem maiusculo da senha valido: " + validadores.get(0));
            if(!validadores.get(0)){
                System.out.println("|| ==> Adicionar mais: " + resultado.get(0) + "\n");
            }
            System.out.println("|| ===> Contagem minusculo da senha valido: " + validadores.get(1));
            if(!validadores.get(1)){
                System.out.println("|| ==> Adicionar mais: " + resultado.get(1) + "\n");
            }
            System.out.println("|| ===> Contagem especial da senha valido: " + validadores.get(3));
            if(!validadores.get(3)){
                System.out.println("|| ==> Adicionar mais: " + resultado.get(3) + "\n");
            }

            if(resultado.get(5) != 0){
                System.out.println("|| ===> Total de caracteres a adicionar: " + resultado.get(5));
            }
        }else{
            System.out.println(resultado.get(5));
        }
    }
}
