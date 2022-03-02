package desafioCapgemini.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilityMethods {
    public static ArrayList<String> inputTokenizer(String input){
        ArrayList<String> retVal = new ArrayList<>();
        //Garante que entrada seja nao nula e nao vazia
        if(input != null && !(input.equals(""))){
            //Verifica se a entrada contem apenas numeros e virgula
            if(input.replaceAll("[0-9,]", "").equals("")){
                retVal = new ArrayList<>(
                        Arrays.asList(input.split(","))
                );
            }
        }
        return retVal;
    }

    public static String inputPreprocessor(String input){
        String retVal = "";
        //Garante que entrada seja nao nula e nao vazia
        if(input != null && !(input.equals(""))){
            //Cria padrao de RegEx para o processamento da entrada
            Pattern pattern = Pattern.compile("\\[[0-9,\\s]*?\\]");
            Matcher matcher = pattern.matcher(input);

            //Se encontrar algo extrai a primeira ocorrencia, removendo depois, tudo que
            //nao for necessario
            if(matcher.find()){
                retVal = matcher.group();
                retVal = retVal.replaceAll("[\\s\\[\\]]","");
            }
        }

        return retVal;
    }

    public static ArrayList<Integer> stringArrayToInteger(ArrayList<String> input){
        ArrayList<Integer> retVal = new ArrayList<>();
        for(String str : input){
            try{
                retVal.add(Integer.parseInt(str));
            }catch (NumberFormatException e){
                e.printStackTrace();
                return retVal;
            }
        }
        return retVal;
    }

    /*
     * inputParser eh responsavel por lidar com entrada inteiros no programa
     * e tratar potenciais exceptions
     * @param scan - Scanner com entrada
     * @return retVal - int com resultado desejado, ou valor de fallback */
    public static int inputParser(Scanner scan) {
        int retVal = 4;
        try {
            retVal = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return retVal;
    }
}
