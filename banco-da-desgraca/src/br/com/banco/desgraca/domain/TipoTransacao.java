package br.com.banco.desgraca.domain;

public enum TipoTransacao {

    ENTRADA("+"),
    SAIDA("-");

    private final String tipoDeTransacao;

    TipoTransacao(String tipoDeTransacao) {
        this.tipoDeTransacao = tipoDeTransacao;
    }

    public String getTipoDeTransacao() {
        return tipoDeTransacao;
    }
}