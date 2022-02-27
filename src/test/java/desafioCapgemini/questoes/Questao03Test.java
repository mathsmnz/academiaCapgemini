package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static desafioCapgemini.questoes.Questao03.buscaAnagramas;

public class Questao03Test {
    @Test
    public void buscaAnagramasRetornaValorEsperado(){
        HashMap<String, Integer> esperado = new HashMap<>();
        esperado.put("ov", 2);
        esperado.put("o", 2);
        Assertions.assertEquals(esperado, buscaAnagramas("ovo"));

        esperado.clear();
        esperado.put("afi", 2);
        esperado.put("i", 2);
        esperado.put("q", 2);
        Assertions.assertEquals(esperado, buscaAnagramas("ifailuhkqq"));

        esperado.clear();
        esperado.put("a", 3);
        esperado.put("ab", 2);
        esperado.put("ac", 2);
        esperado.put("aabc", 2);
        Assertions.assertEquals(esperado, buscaAnagramas("abacate"));

    }

    @Test
    public void buscaAnagramasRetornaVazioEntradaSemAnagramas(){
        HashMap<String, Integer> esperado = new HashMap<>();
        Assertions.assertEquals(esperado, buscaAnagramas("a"));
    }

    @Test
    public void buscaAnagramasRetornaVazioEntradaVazia(){
        HashMap<String, Integer> esperado = new HashMap<>();
        Assertions.assertEquals(esperado, buscaAnagramas(""));
    }

    @Test
    public void buscaAnagramasRetornaVazioEntradaNula(){
        HashMap<String, Integer> esperado = new HashMap<>();
        Assertions.assertEquals(esperado, buscaAnagramas(null));
    }
}
