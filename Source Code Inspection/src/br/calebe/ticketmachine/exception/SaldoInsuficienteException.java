package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("SaldoInsuficienteException occurred");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
