package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.ContaException;
import java.time.LocalDate;

public class ContaCorrente extends Conta {

    public ContaCorrente(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        super(numeroConta, instituicaoBancaria);
    }

    @Override
    public void sacar(Double valor) {
        if (valor % 5 == 0) {
            super.sacar(valor);
        } else try {
            throw new ContaException("Só são permitido saques com valores múltiplos de R$ 5,00");
        } catch (ContaException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        super.transferir(valor, contaDestino);
        if (isDifferentBank(contaDestino.getInstituicaoBancaria())) {
            saldo -= (valor * 0.01);
        }
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        super.exibirExtrato(inicio, fim);
    }

    @Override
    public String toString() {
        return "Conta Corrente " + instituicaoBancaria.getBanco() + " " + numeroConta;
    }

}