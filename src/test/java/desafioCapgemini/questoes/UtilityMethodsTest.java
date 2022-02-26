package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static desafioCapgemini.util.UtilityMethods.*;

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

    @Test
    public void countCharactersRetornaValorEsperadoModoEspecial(){
        String senha = "d!ab";
        int result = countCharacters(senha, 4);
        Assertions.assertEquals(1, result);

        senha = "@)a@";
        result = countCharacters(senha, 4);
        Assertions.assertEquals(3, result);

        senha = "!@#$%";
        result = countCharacters(senha, 4);
        Assertions.assertEquals(5, result);

        senha = "!@#$%^&*()-+";
        result = countCharacters(senha, 4);
        Assertions.assertEquals(12, result);

        senha = "12ABab!*";
        result = countCharacters(senha, 4);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void countCharactersRetornaValorEsperadoModoDigito(){
        String senha = "a1aB";
        int result = countCharacters(senha, 3);
        Assertions.assertEquals(1, result);

        senha = "456a7";
        result = countCharacters(senha, 3);
        Assertions.assertEquals(4, result);

        senha = "45622";
        result = countCharacters(senha, 3);
        Assertions.assertEquals(5, result);

        senha = "12ABab!*";
        result = countCharacters(senha, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void countCharactersRetornaValorEsperadoModeMinusculo(){
        String senha = "aaaB";
        int result = countCharacters(senha, 2);
        Assertions.assertEquals(3, result);

        senha = "BBaD";
        result = countCharacters(senha, 2);
        Assertions.assertEquals(1, result);

        senha = "aaad";
        result = countCharacters(senha, 2);
        Assertions.assertEquals(4, result);

        senha = "ab12!";
        result = countCharacters(senha, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void countCharactersRetornaValorEsperadoModeMaiusculo(){
        String senha = "aaaB";
        int result = countCharacters(senha, 1);
        Assertions.assertEquals(1, result);

        senha = "BBaD";
        result = countCharacters(senha, 1);
        Assertions.assertEquals(3, result);

        senha = "AAAD";
        result = countCharacters(senha, 1);
        Assertions.assertEquals(4, result);

        senha = "AB12!";
        result = countCharacters(senha, 1);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void countCharactersRetornaZeroModeErrado(){
        int result = countCharacters("string", 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void countCharactersRetornaZeroInputNulo(){
        int result = countCharacters(null, 0);
        Assertions.assertEquals(0, result);
    }
}
