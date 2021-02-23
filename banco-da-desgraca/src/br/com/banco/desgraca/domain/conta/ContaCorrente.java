package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

    private Integer numeroConta;
    private InstituicaoBancaria instituicaoBancaria;

    public ContaCorrente(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        super(numeroConta,instituicaoBancaria);

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