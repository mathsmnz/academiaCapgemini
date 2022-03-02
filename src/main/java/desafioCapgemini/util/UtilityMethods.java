package desafioCapgemini.util;

import java.util.Scanner;

public class UtilityMethods {

    /*
     * inputParser eh responsavel por lidar com entrada inteiros no programa
     * e lidar com potenciais exceptions
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
