package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicketMachineTest {
    
    @Test
    public void inserirTest() throws PapelMoedaInvalidaException {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.inserir(10);
        assertEquals(10, ticketMachine.getSaldo());
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void inserirExceptionTest() throws PapelMoedaInvalidaException {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.inserir(7);
    }

    @Test
    public void getSaldoTest() throws PapelMoedaInvalidaException {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.inserir(10);
        assertEquals(10, ticketMachine.getSaldo());
    }

    @Test
    public void getSaldoWrongTest() throws PapelMoedaInvalidaException {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.inserir(10);
        assertNotEquals(5, ticketMachine.getSaldo());
    }

    @Test
    public void imprimirTest() throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.inserir(10);
        String result = ticketMachine.imprimir();
        String expected = "*****************\n*** R$ 10,00 ****\n*****************\n";
        assertEquals(expected, result);
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void imprimirExceptionTest() throws SaldoInsuficienteException {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.imprimir();
    }
}
