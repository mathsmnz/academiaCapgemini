package desafioCapgemini.questoes;

import java.util.ArrayList;

import static desafioCapgemini.util.UtilityMethods.inputPreprocessor;

public class Questao03 {
    public static String encriptaString(ArrayList<String> input) {
        StringBuilder retVal = new StringBuilder();
        if (input != null && !input.isEmpty()) {
            int length = input.get(0).length();
            for (int i = 0; i < length; i++) {
                for (String s : input) {
                    if (s.length() > i) {
                        retVal.append(s.charAt(i));
                    }
                }
                retVal.append(" ");
            }
        }

        return (retVal.toString()).trim();
    }

    public static ArrayList<String> criaGrid(String input) {
        ArrayList<String> retVal = new ArrayList<>();
        if (input != null && !(input.equals(""))) {
            int size = (int) Math.ceil(Math.sqrt(input.length()));
            for (int i = 0; i < input.length(); i = i + size) {
                if ((input.length() - size) < i) {
                    retVal.add(input.substring(i));
                } else {
                    retVal.add(input.substring(i, i + size));
                }
            }
        }
        return retVal;
    }

    static String pattern = "=(.*$)";
    public static void q3ImprimeResultado(String input) {
        if(input != null && !(input.equals(""))){
            String result = inputPreprocessor(input, pattern, 1);
            if(result.length() > 1){
                result = encriptaString(criaGrid(result));
                System.out.println("|| ===> "+ result);
            }else{
                System.out.println("|| ===> "+ input);
            }
        }else{
            System.out.println("|| ===> Entrada invalida");
        }
    }
}
