package desafioCapgemini.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static desafioCapgemini.util.UtilityMethods.*;

public class UtilityMethodsTest {
    @Test
    public void inputTokanizerRetornaVazioEntradaInvalida(){
        ArrayList<String> esperado = new ArrayList<>();

        Assertions.assertEquals(esperado, inputTokanizer("dfgkhjdsdkfghj[da"));

        Assertions.assertEquals(esperado, inputTokanizer("n = [5, 2, 12, 3]"));

        Assertions.assertEquals(esperado, inputTokanizer("n=[1,45,69]"));

        Assertions.assertEquals(esperado, inputTokanizer("arr=[75,23,7,5,13]"));
    }
    @Test
    public void inputTokanizerRetornaValorEsperadoEntradaValida(){
        ArrayList<String> esperado = new ArrayList<>(
                Arrays.asList("1","2","3","4")
        );
        String testString = inputPreprocessor("arr = [1, 2, 3, 4]");
        Assertions.assertEquals(esperado, inputTokanizer(testString));
        esperado = new ArrayList<>(
                Arrays.asList("5","2","12","3")
        );

        testString =  inputPreprocessor("n = [5, 2, 12, 3]");
        Assertions.assertEquals(esperado, inputTokanizer(testString));
        esperado = new ArrayList<>(
                Arrays.asList("1","45","69")
        );

        testString = inputPreprocessor("n=[1,45,69]");
        Assertions.assertEquals(esperado, inputTokanizer(testString));
        esperado = new ArrayList<>(
                Arrays.asList("75","23","7","5","13")
        );

        testString = inputPreprocessor("arr=[75,23,7,5,13]");
        Assertions.assertEquals(esperado, inputTokanizer(testString));
    }

    @Test
    public void inputTokanizerRetornaVazioEntradaVazia() {
        ArrayList<String> esperado = new ArrayList<>();
        Assertions.assertEquals(esperado, inputTokanizer(""));
    }

    @Test
    public void inputTokanizerRetornaVazioEntradaNula() {
        ArrayList<String> esperado = new ArrayList<>();
        Assertions.assertEquals(esperado, inputTokanizer(null));
    }

    @Test
    public void inputPreprocessorRetornaValorEsperadoEntradaInvalida(){
        String esperado = "";
        Assertions.assertEquals("123", inputPreprocessor("opa = [123] =sdfklhj;fgh][[sdgfhjfgh123,,,85dfghgfsfg]sdfgsdfgsfgs"));
        Assertions.assertEquals("9,2,1,4,6", inputPreprocessor("arr = [9, 2, 1, 4, 6][bdc][1234]"));
        Assertions.assertEquals(esperado, inputPreprocessor("asldfkgsacvuhsr"));
        Assertions.assertEquals(esperado, inputPreprocessor("[][123]"));
    }

    @Test
    public void inputPreprocessorRetornaValorEsperadoEntradaValida(){
        String esperado = "1,2,3,4";
        Assertions.assertEquals(esperado, inputPreprocessor("arr = [1, 2, 3, 4]"));

        esperado = "5,2,12,3";
        Assertions.assertEquals(esperado, inputPreprocessor("n = [5, 2, 12, 3]"));

        esperado = "1,45,69";
        Assertions.assertEquals(esperado, inputPreprocessor("n=[1,45,69]"));

        esperado = "75,23,7,5,13";
        Assertions.assertEquals(esperado, inputPreprocessor("arr=[75,23,7,5,13]"));
    }

    @Test
    public void inputPreprocessorRetornaVazioEntradaNula(){
        Assertions.assertEquals("", inputPreprocessor(null));
    }

    @Test
    public void inputPreprocessorRetornaVazioEntradaVazia(){
        Assertions.assertEquals("", inputPreprocessor(""));
    }
    
    @Test
    public void inputParserRetornaIntEntradaValida() {
        InputStream sysInBackup = System.in;

        ByteArrayInputStream in = new ByteArrayInputStream("13".getBytes(StandardCharsets.UTF_8));
        Scanner scan = new Scanner(in);
        Assertions.assertEquals(13, inputParser(scan));

        in = new ByteArrayInputStream("24".getBytes(StandardCharsets.UTF_8));
        scan = new Scanner(in);
        Assertions.assertEquals(24, inputParser(scan));

        in = new ByteArrayInputStream("12524823".getBytes(StandardCharsets.UTF_8));
        scan = new Scanner(in);
        Assertions.assertEquals(12524823, inputParser(scan));

        in = new ByteArrayInputStream("-69".getBytes(StandardCharsets.UTF_8));
        scan = new Scanner(in);
        Assertions.assertEquals(-69, inputParser(scan));

        System.setIn(sysInBackup);
    }
}
