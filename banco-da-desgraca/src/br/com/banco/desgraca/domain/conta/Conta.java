package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

public abstract class Conta implements ContaBancaria {

    protected Integer numeroConta;
    protected InstituicaoBancaria instituicaoBancaria;
    protected Double saldo;


    public Conta(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        this.numeroConta = numeroConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = 0.0;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }


    @Override
    public void sacar(Double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }

    @Override
    public String toString() {
        return "Conta " + getInstituicaoBancaria().getBanco() + " " + this.numeroConta;
    }


}
