package br.com.banco.desgraca.domain;

public enum TipoTransacao {

    ENTRADA("Transação de Entrada"),
    SAIDA("Trasação de saída");

    private String tipoDeTransacao;

    TipoTransacao(String tipoDeTransacao) {
        this.tipoDeTransacao = tipoDeTransacao;
    }

    public String getTipoDeTransacao() {
        return tipoDeTransacao;
    }
}