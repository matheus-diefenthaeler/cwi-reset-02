package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class Conta implements ContaBancaria {

    protected Integer numeroConta;
    protected InstituicaoBancaria instituicaoBancaria;
    protected Double saldo;
    protected List<Transacao> listaTransacao;


    public Conta(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        this.listaTransacao = new ArrayList<>();
        this.numeroConta = numeroConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = 0.0;
    }

    protected void saveTransaction(TipoTransacao tipoTransacao, Double valor) {
        listaTransacao.add(createTransaction(tipoTransacao, valor));
    }

    protected Transacao createTransaction(TipoTransacao tipoTransacao, Double valor) {
        return new Transacao(tipoTransacao, valor, Data.getDataTransacao());
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    @Override
    public void sacar(Double valor) {
        if (saldo > valor) {
            saldo -= valor;
            saveTransaction(TipoTransacao.SAIDA, valor);
            System.out.println("Sacando valor " + DecimalFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor) + " da " + toString());
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
        }
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
        saveTransaction(TipoTransacao.ENTRADA, valor);
        System.out.println("Depositando valor " + DecimalFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor) + " na " + toString());
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
       try {
           sacar(valor);
       }catch (Exception e){
           throw new SaldoInsuficienteException("Saldo insuficiente para transferencia!");
       }
        contaDestino.depositar(valor);
        System.out.println("Transferindo valor " + DecimalFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor) +
                " da " + toString() + " para " + contaDestino.toString());
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        builder.append("----- EXTRATO ").append(toString().toUpperCase()).append("\n");
        for (Transacao transacao : listaTransacao) {
            if (inicio != null && transacao.getData().isAfter(inicio)) {
                builder.append(transacao.getDetails()).append("\n");
            } else if (fim != null && transacao.getData().isBefore(fim)) {
                builder.append(transacao.getDetails()).append("\n");
            } else if (inicio == null && fim == null) {
                builder.append(transacao.getDetails()).append("\n");
            }
        }
        builder.append("-----");
        System.out.println(builder.toString());
    }

    protected Boolean isDifferentBank(InstituicaoBancaria instituicaoBancaria) {
        return this.instituicaoBancaria != instituicaoBancaria;
    }

}
