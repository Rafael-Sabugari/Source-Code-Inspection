package br.calebe.ticketmachine.core;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Iterator;

public class TrocoTest {

    @Test
    public void getInstanceTest() {
        Troco troco = new Troco(10);
        assertEquals(Troco.class, troco.getClass());
    }
    
    @Test
    public void getIteratorTest() {
        Troco troco = new Troco(123);
        Iterator<PapelMoeda> iterator = troco.getIterator();
        int[] expectedValues = {100, 20, 2, 1};
        int[] expectedQuantities = {1, 1, 1, 1};
        int i = 0;

        while (iterator.hasNext()) {
            PapelMoeda papelMoeda = iterator.next();
            assertEquals(expectedValues[i], papelMoeda.getValor());
            assertEquals(expectedQuantities[i], papelMoeda.getQuantidade());
            i++;
        }
    }
}
