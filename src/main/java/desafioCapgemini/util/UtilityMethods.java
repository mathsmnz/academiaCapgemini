package desafioCapgemini.util;

import java.util.Scanner;

public class UtilityMethods {
    /*
    * preencheString eh responsavel por gerar uma nova string preenchida
    * @param tgtSize - Tamanho desejado
    * @param input - String de destino
    * @param fill - char que sera usado para preencher
    * @return retVal - String de retorno*/
    public static String preencheString(int tgtSize, String input, char fill){

        if(input.length() >= tgtSize){
            return input;
        }else{
            StringBuilder retVal = new StringBuilder();
            int size = tgtSize - input.length();
            //itera adicionando fill a string nova, depois adicionando a entrada a ela
            retVal.append(String.valueOf(fill).repeat(size));
            retVal.append(input);
            return retVal.toString();
        }
    }

    /*
    countCharacters eh responsavel por contar a quantidade de
    caracteres em diferentes modos, sendo eles
    1 - Maiusculo
    2 - Minusculo
    3 - Digitos
    4 - Especial
    @param input - String de entrada
    @return retVal - Int contendo a contagem solicitada
    */
    public static int countCharacters(String input, int mode){
        if(input == null){
            return 0;
        }else {
            if(input.length() == 0){
                return 0;
            }else{
                int retVal = 0;
                //Itera a partir da entrada, fazendo verificacoes de acordo com o modo
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    switch (mode){
                        //Conta caracteres maiusculos
                        case 1:
                            if (Character.isUpperCase(ch)){
                                retVal++;
                            }
                            break;
                        //Conta caracteres minusculos
                        case 2:
                            if(Character.isLowerCase(ch)){
                                retVal++;
                            }
                            break;
                        //Conta digitos
                        case 3:
                            if(Character.isDigit(ch)){
                                retVal++;
                            }
                            break;
                        //Conta caracteres especiais
                        case 4:
                            String special = "!@#$%^&*()-+";
                            if(special.contains(Character.toString(ch))){
                                retVal++;
                            }
                            break;
                        default:
                            return 0;
                    }
                }

                return retVal;
            }
        }
    }

    /*
    * inputParser eh responsavel por lidar com entrada inteiros no programa
    * e lidar com potenciais exceptions
    * @param scan - Scanner com entrada
    * @return retVal - int com resultado desejado, ou valor de fallback */
    public static int inputParser(Scanner scan){
        int retVal = 4;
        try{
            retVal = Integer.parseInt(scan.nextLine());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        return retVal;
    }
}
