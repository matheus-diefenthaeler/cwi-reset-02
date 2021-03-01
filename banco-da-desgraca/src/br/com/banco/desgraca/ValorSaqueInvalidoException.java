package br.com.banco.desgraca;

public class ValorSaqueInvalidoException extends RuntimeException {

    private static final long serialVersionUID = 914940045763315489L;

    public ValorSaqueInvalidoException(String message) {
        super(message);
    }
}