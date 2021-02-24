package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaBancaria;

import java.time.LocalDate;

public class Transacao implements ContaBancaria {

    private TipoTransacao tipoTransacao;
    private ContaBancaria contaOrigem;
    private ContaBancaria contaDestino;

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return null;
    }

    @Override
    public Double consultarSaldo() {
        return this.consultarSaldo();
    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }
}