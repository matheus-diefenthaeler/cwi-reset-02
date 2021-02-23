package br.com.banco.desgraca.domain;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL("Banco do Brasil"),
    BRADESCO("Bradesco"),
    CAIXA("Caixa Economica Federal"),
    ITAU("Itau"),
    NUBANK("Nubank");


    private String banco;

    InstituicaoBancaria(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }


}

