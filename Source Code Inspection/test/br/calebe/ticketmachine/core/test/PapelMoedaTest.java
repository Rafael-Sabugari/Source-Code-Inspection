package br.calebe.ticketmachine.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.PapelMoeda;

public class PapelMoedaTest {
    
    @Test
    public void getInstanceTest() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 5);
        assertEquals(PapelMoeda.class, papelMoeda.getClass());
    }
    
    @Test
    public void getValorTest() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 5);
        int result = papelMoeda.getValor();
        assertEquals(10, result);
    }

    @Test
    public void getValorWrongTest() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 5);
        int result = papelMoeda.getValor();
        assertNotEquals(5, result);
    }

    @Test
    public void getQuantidadeTest() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 20);
        int result = papelMoeda.getQuantidade();
        assertEquals(20, result);
    }

    @Test
    public void getQuantidadeWrongTest() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 20);
        int result = papelMoeda.getQuantidade();
        assertNotEquals(5, result);
    }
}
