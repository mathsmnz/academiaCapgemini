package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static desafioCapgemini.util.UtilityMethods.preencheString;

public class UtilityMethodsTest {
    @Test
    public void preencheStringDeveRetornarStringDeTamanhoCorreto(){
        String str = "";
        for (int i = 1; i <= 5; i++) {
            str = preencheString(i, str, ' ');
            Assertions.assertEquals(i, str.length());
        }
    }
    @Test
    public void preencheStringDeveRetornarEntradaCasoTgtSizeZero(){
        String str = "String";
        Assertions.assertEquals(str, preencheString(3, str, ' '));
        str = "Aba";
        Assertions.assertEquals(str, preencheString(2, str, ' '));
        str = "Constitucional";
        Assertions.assertEquals(str, preencheString(5, str, ' '));
    }
}
