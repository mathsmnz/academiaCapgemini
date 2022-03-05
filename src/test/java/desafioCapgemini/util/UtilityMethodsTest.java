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
    String pattern = "\\[([0-9,\\s]*?)\\]";
    int group = 1;

    @Test
    public void inputTokenizerRetornaVazioEntradaInvalida(){
        ArrayList<String> esperado = new ArrayList<>();

        Assertions.assertEquals(esperado, inputTokenizer("dfgkhjdsdkfghj[da"));

        Assertions.assertEquals(esperado, inputTokenizer("n = [5, 2, 12, 3]"));

        Assertions.assertEquals(esperado, inputTokenizer("n=[1,45,69]"));

        Assertions.assertEquals(esperado, inputTokenizer("arr=[75,23,7,5,13]"));
    }
    @Test
    public void inputTokenizerRetornaValorEsperadoEntradaValida(){
        ArrayList<String> esperado = new ArrayList<>(
                Arrays.asList("1","2","3","4")
        );
        String testString = inputPreprocessor("arr = [1, 2, 3, 4]", pattern, group);
        Assertions.assertEquals(esperado, inputTokenizer(testString));
        esperado = new ArrayList<>(
                Arrays.asList("5","2","12","3")
        );

        testString =  inputPreprocessor("n = [5, 2, 12, 3]", pattern, group);
        Assertions.assertEquals(esperado, inputTokenizer(testString));
        esperado = new ArrayList<>(
                Arrays.asList("1","45","69")
        );

        testString = inputPreprocessor("n=[1,45,69]", pattern, group);
        Assertions.assertEquals(esperado, inputTokenizer(testString));
        esperado = new ArrayList<>(
                Arrays.asList("75","23","7","5","13")
        );

        testString = inputPreprocessor("arr=[75,23,7,5,13]", pattern, group);
        Assertions.assertEquals(esperado, inputTokenizer(testString));
    }

    @Test
    public void inputTokenizerRetornaVazioEntradaVazia() {
        ArrayList<String> esperado = new ArrayList<>();
        Assertions.assertEquals(esperado, inputTokenizer(""));
    }

    @Test
    public void inputTokenizerRetornaVazioEntradaNula() {
        ArrayList<String> esperado = new ArrayList<>();
        Assertions.assertEquals(esperado, inputTokenizer(null));
    }

    @Test
    public void inputPreprocessorRetornaValorEsperadoEntradaInvalida(){
        String esperado = "";
        Assertions.assertEquals("123", inputPreprocessor("opa = [123] =sdfklhj;fgh][[sdgfhjfgh123,,,85dfghgfsfg]sdfgsdfgsfgs", pattern, group));
        Assertions.assertEquals("9,2,1,4,6", inputPreprocessor("arr = [9, 2, 1, 4, 6][bdc][1234]", pattern, group));
        Assertions.assertEquals(esperado, inputPreprocessor("asldfkgsac[123abc]vuhsr", pattern, group));
        Assertions.assertEquals(esperado, inputPreprocessor("[][123]", pattern, group));
    }

    @Test
    public void inputPreprocessorRetornaValorEsperadoEntradaValida(){
        String esperado = "1,2,3,4";
        Assertions.assertEquals(esperado, inputPreprocessor("arr = [1, 2, 3, 4]", pattern, group));

        esperado = "5,2,12,3";
        Assertions.assertEquals(esperado, inputPreprocessor("n = [5, 2, 12, 3]", pattern, group));

        esperado = "1,45,69";
        Assertions.assertEquals(esperado, inputPreprocessor("n=[1,45,69]", pattern, group));

        esperado = "75,23,7,5,13";
        Assertions.assertEquals(esperado, inputPreprocessor("arr=[75,23,7,5,13]", pattern, group));
    }

    @Test
    public void inputPreprocessorRetornaVazioEntradaNula(){
        Assertions.assertEquals("", inputPreprocessor(null, pattern, group));
    }

    @Test
    public void inputPreprocessorRetornaVazioEntradaVazia(){
        Assertions.assertEquals("", inputPreprocessor("", pattern, group));
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
