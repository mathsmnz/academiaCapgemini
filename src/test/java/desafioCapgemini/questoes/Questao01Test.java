package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static desafioCapgemini.questoes.Questao01.geraEscada;

public class Questao01Test {
    @Test
    public void geraEscadaDeveRetornarResultadoEsperado(){
        ArrayList<String> list = new ArrayList<>();
        list.add("     *");
        list.add("    **");
        list.add("   ***");
        list.add("  ****");
        list.add(" *****");
        list.add("******");

        ArrayList<String> result = geraEscada(6);

        Assertions.assertEquals(list, result);
    }
    @Test
    public void geraEscadaDeveRetornarQuantidadeEsperadaDeLinhas(){
        for (int i = 0; i < 10; i++) {
            Assertions.assertEquals(i, geraEscada(i).size());
        }
    }
    @Test
    public void geraEscadaRetornaValorNaoNuloQuandoEntradaDiferenteDeZero(){
        ArrayList<String> result = geraEscada(5);
        Assertions.assertNotNull(result);
    }
    @Test
    public void geraEscadaRetornaValorNaoNuloQuandoEntradaZero(){
        ArrayList<String> result = geraEscada(0);
        Assertions.assertNotNull(result);
    }
    @Test
    public void geraEscadaRetornaVazioQuandoEntradaZero(){
        ArrayList<String> result = geraEscada(0);
        Assertions.assertTrue(result.isEmpty());
    }

}
