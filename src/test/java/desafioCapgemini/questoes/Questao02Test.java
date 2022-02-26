package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static desafioCapgemini.questoes.Questao02.validaSenha;

public class Questao02Test {
    @Test
    public void validaSenhaRetornaValorEsperadoSenhaInvalida(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0,0,0,1,2,3));
        String senha = "Ya3";
        Assertions.assertEquals(esperado, validaSenha(senha));

        esperado = new ArrayList<>(Arrays.asList(0,1,1,1,1,4));
        senha = "AB";
        Assertions.assertEquals(esperado, validaSenha(senha));

        esperado = new ArrayList<>(Arrays.asList(1,1,0,1,2,5));
        senha = "3";
        Assertions.assertEquals(esperado, validaSenha(senha));

        esperado = new ArrayList<>(Arrays.asList(0,1,1,1,0,3));
        senha = "AAAAAA";
        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaValorEsperadoApenasTamanhoInvalido(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0,0,0,0,1,1));
        String senha = "aB1@C";
        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaValorEsperadoApenasEspecialInvalido(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0,0,0,1,0,1));
        String senha = "a1Aaa";
        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaValorEsperadoApenasDigitoInvalido(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0,0,1,0,0,1));
        String senha = "aA@aa";
        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaValorEsperadoApenasMinusculoInvalido(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0,1,0,0,0,1));
        String senha = "A1@AA";
        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaValorEsperadoApenasMaiusculoInvalido(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(1,0,0,0,0,1));
        String senha = "a1@aa";
        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaValorEsperadoEntradaValida(){
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        String senha = "aB1@CD";

        Assertions.assertEquals(esperado, validaSenha(senha));
    }

    @Test
    public void validaSenhaRetornaTamanhoMinEntradaVazia(){
        ArrayList<Integer> esperado = new ArrayList<>();
        int tamMin = 6;
        Assertions.assertEquals(tamMin, validaSenha("").size());
    }

    @Test
    public void validaSenhaRetornaVazioEntradaNula(){
        ArrayList<Integer> resultado = new ArrayList<>();
        Assertions.assertEquals(resultado, validaSenha(null));
    }
}
