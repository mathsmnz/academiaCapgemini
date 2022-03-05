package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static desafioCapgemini.questoes.Questao01.calculaMediana;

public class Questao01Test {
    @Test
    public void calculaMedianaRetornaMediaEntradaValida(){
        ArrayList<Integer> entrada = new ArrayList<>();

        entrada.add(1);
        entrada.add(3);
        entrada.add(15);
        Assertions.assertEquals(3, calculaMediana(entrada));

        entrada.clear();

        entrada.add(3);
        entrada.add(9);
        entrada.add(23);
        entrada.add(1);
        Assertions.assertEquals(6, calculaMediana(entrada));

        entrada.clear();

        entrada.add(1);
        entrada.add(8);
        entrada.add(2);
        entrada.add(21);
        Assertions.assertEquals(5, calculaMediana(entrada));
    }

    @Test
    public void calculaMedianaRetornaMediaEntradaDupla(){
        ArrayList<Integer> entrada = new ArrayList<>();

        entrada.add(1);
        entrada.add(3);
        Assertions.assertEquals(2, calculaMediana(entrada));

        entrada.clear();

        entrada.add(3);
        entrada.add(9);
        Assertions.assertEquals(6, calculaMediana(entrada));

        entrada.clear();

        entrada.add(8);
        entrada.add(2);
        Assertions.assertEquals(5, calculaMediana(entrada));
    }

    @Test
    public void calculaMedianaRetornaValorEntradaUnica(){
       ArrayList<Integer> entrada = new ArrayList<>();

       entrada.add(1);
       Assertions.assertEquals(1, calculaMediana(entrada));

       entrada.clear(); entrada.add(3);
       Assertions.assertEquals(3, calculaMediana(entrada));

       entrada.clear(); entrada.add(8);
       Assertions.assertEquals(8, calculaMediana(entrada));
    }

    @Test
    public void calculaMedianaRetornaZeroEntradaNula(){
        Assertions.assertEquals(0, calculaMediana(null));
    }
    @Test
    public void calculaMedianaRetornaZeroEntradaVazia(){
        ArrayList<Integer> esperado = new ArrayList<>();
        Assertions.assertEquals(0, calculaMediana(esperado));
    }
}
