package desafioCapgemini.questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static desafioCapgemini.questoes.Questao03.criaGrid;
import static desafioCapgemini.questoes.Questao03.encriptaString;

public class Questao03Test {
    @Test
    public void encriptaStringRetornaValorEsperadoEntradaValida() {
        String esperado = "jti udt so";
        String input = "justdoit";
        Assertions.assertEquals(esperado, encriptaString(criaGrid(input)));

        input = "gottagofast";
        esperado = "gaa ogs tot tf";
        Assertions.assertEquals(esperado, encriptaString(criaGrid(input)));

        input = "thekingisdeadlonglivetheking";
        esperado = "tgdik hilvi esoen kdntg iegh nale";
        Assertions.assertEquals(esperado, encriptaString(criaGrid(input)));

        esperado = "AkawuIsafesehi cntaltmtteabas coiydsalhoneti owotbwliefyehm rnnheiltgcwsup dltaanttroadmo iahtbgolouyoas nwealsgeursnns gsrbeaebnsBtsi toeetrtodeectb ofieoeidTfcahl aassfttyhlarie lvnhlosoeiuen liooyoffbeswk";
        input = "AccordingtoallknownlawsofaviationthereisnowaythatabeeshouldbeabletoflyItswingsaretoosmalltogetitsfatlittlebodyoffthegroundThebeeofcoursefliesanywaysBecausebeesdontcarewhathumansthinkisimpossible";
        Assertions.assertEquals(esperado, encriptaString(criaGrid(input)));

    }

    @Test
    public void encriptaStringRetornaVazioEntradaVazia() {
        ArrayList<String> entrada = new ArrayList<>();
        Assertions.assertEquals("", encriptaString(entrada));
    }

    @Test
    public void encriptaStringRetornaVazioEntradaNula() {
        Assertions.assertEquals("", encriptaString(null));
    }

    @Test
    public void criaGridRetornaEntradaEntradaValida() {
        ArrayList<String> esperado = new ArrayList<>();

        esperado.add("thekin");
        esperado.add("gisdea");
        esperado.add("dlongl");
        esperado.add("ivethe");
        esperado.add("king");
        Assertions.assertEquals(esperado, criaGrid("thekingisdeadlonglivetheking"));

        esperado.clear();

        esperado.add("gott");
        esperado.add("agof");
        esperado.add("ast");
        Assertions.assertEquals(esperado, criaGrid("gottagofast"));

        esperado.clear();

        esperado.add("jus");
        esperado.add("tdo");
        esperado.add("it");
        Assertions.assertEquals(esperado, criaGrid("justdoit"));

        esperado.clear();
        esperado.add("Accordingtoall");
        esperado.add("knownlawsofavi");
        esperado.add("ationthereisno");
        esperado.add("waythatabeesho");
        esperado.add("uldbeabletofly");
        esperado.add("Itswingsaretoo");
        esperado.add("smalltogetitsf");
        esperado.add("atlittlebodyof");
        esperado.add("fthegroundTheb");
        esperado.add("eeofcourseflie");
        esperado.add("sanywaysBecaus");
        esperado.add("ebeesdontcarew");
        esperado.add("hathumansthink");
        esperado.add("isimpossible");

        String input = "AccordingtoallknownlawsofaviationthereisnowaythatabeeshouldbeabletoflyItswingsaretoosmalltogetitsfatlittlebodyoffthegroundThebeeofcoursefliesanywaysBecausebeesdontcarewhathumansthinkisimpossible";
        Assertions.assertEquals(esperado, criaGrid(input));
    }

    @Test
    public void criaGridRetornaGridTamanhoCorreto() {
        String str = "a";
        for (int i = 1; i <= 10; i++) {
            String teste = str.repeat(i);
            int size = criaGrid(teste).size();
            int length = criaGrid(teste).get(0).length();
            int area = size * length;
            Assertions.assertTrue(area >= i);
        }
    }

    @Test
    public void criaGridRetornaEntradaEntradaUnica() {
        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("a");
        Assertions.assertEquals(esperado, criaGrid("a"));
    }

    @Test
    public void criaGridRetornaVazioEntradaVazia() {
        ArrayList<String> esperado = new ArrayList<>();
        Assertions.assertEquals(esperado, criaGrid(""));
    }

    @Test
    public void criaGridRetornaVazioEntradaNula() {
        ArrayList<String> esperado = new ArrayList<>();
        Assertions.assertEquals(esperado, criaGrid(null));
    }
}
