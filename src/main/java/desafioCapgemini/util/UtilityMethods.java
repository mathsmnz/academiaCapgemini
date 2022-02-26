package desafioCapgemini.util;

public class UtilityMethods {
    public static String preencheString(int tgtSize, String input, char fill){

        if(input.length() >= tgtSize){
            return input;
        }else{
            StringBuilder retval = new StringBuilder();
            int size = tgtSize - input.length();
            retval.append(String.valueOf(fill).repeat(size));
            retval.append(input);
            return retval.toString();
        }
    }
}
