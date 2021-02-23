package br.com.banco.desgraca.exception;

import br.com.banco.desgraca.domain.conta.ContaDigital;

public class ContaException extends Exception{
    public ContaException(final String message){
        super(message);
    }
}
