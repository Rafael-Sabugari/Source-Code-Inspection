package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    public PapelMoedaInvalidaException() {
        super("PapelMoedaInvalidaException occurred");
    }

    public PapelMoedaInvalidaException(String message) {
        super(message);
    }
}
