package br.com.banco.desgraca.domain;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Transacao {

    private final TipoTransacao tipoTransacao;
    private final Double valor;
    private final LocalDate data;

    public Transacao(TipoTransacao tipoTransacao, Double valor, LocalDate data) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.data = data;
    }

    public LocalDate getData(){
        return data;
    }

    public String getDetails(){
        return tipoTransacao.getTipoDeTransacao() + " " + DecimalFormat.getCurrencyInstance(new Locale("pt","BR")).format(valor)
                + " " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}