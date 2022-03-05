package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static desafioCapgemini.questoes.Questao02.encontraPares;

public class Questao02Test {
    HashMap<Integer, Integer> esperado;

    @Test
    public void encontraParesRetornaValorEsperado(){
        esperado = new HashMap<>();
        ArrayList<Integer> entrada = new ArrayList<>(Arrays.asList(1,5,3,4,2));

        esperado.put(5,3);
        esperado.put(4,2);
        esperado.put(3,1);

        Assertions.assertEquals(esperado, encontraPares(entrada));

        esperado.clear();
        entrada = new ArrayList<>(Arrays.asList(2,3,4,4,5,1));

        esperado.put(5,4);
        esperado.put(4,3);
        esperado.put(3,2);
        esperado.put(2,1);

        Assertions.assertEquals(esperado, encontraPares(entrada));

        esperado.clear();
        entrada = new ArrayList<>(Arrays.asList(2,3,4,5,7));

        Assertions.assertEquals(esperado, encontraPares(entrada));
    }

    @Test
    public void encontraParesRetornaValorEsperadoEntradaDupla(){
        esperado = new HashMap<>();
        ArrayList<Integer> entrada = new ArrayList<>();
        entrada.add(1);
        entrada.add(2);

        Assertions.assertEquals(esperado, encontraPares(entrada));

        entrada.clear();
        entrada.add(2);
        entrada.add(1);
        esperado.put(2,1);
        Assertions.assertEquals(esperado, encontraPares(entrada));
    }

    @Test
    public void encontraParesRetornaVazioEntradaUnica(){
        esperado = new HashMap<>();
        ArrayList<Integer> entrada = new ArrayList<>();
        entrada.add(1);

        Assertions.assertEquals(esperado, encontraPares(entrada));
    }

    @Test
    public void encontraParesRetornaVazioEntradaVazia(){
        esperado = new HashMap<>();
        Assertions.assertEquals(esperado, encontraPares(new ArrayList<>()));
    }

    @Test
    public void encontraParesRetornaVazioEntradaNula(){
        esperado = new HashMap<>();
        Assertions.assertEquals(esperado, encontraPares(null));
    }
}
