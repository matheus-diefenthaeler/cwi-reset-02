package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.ContaException;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) throws ContaException {
        super(numeroConta, instituicaoBancaria);
        if (!isAllowedBank(instituicaoBancaria)) {
            throw new ContaException("Não é possui criar uma conta poupanca no banco " + instituicaoBancaria.getBanco());
        }
    }

    @Override
    public void sacar(Double valor) {
        if (valor >= 50) {
            saldo -= (valor * 0.02);
            super.sacar(valor);
        } else try {
            throw new ContaException("Nao foi realizar o saque, somente valores acima de R$ 50,00");
        } catch (ContaException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        super.transferir(valor, contaDestino);
        if (isDifferentBank(contaDestino.getInstituicaoBancaria())) {
            saldo -= (valor * 0.01);
        } else {
            saldo -= (valor * 0.005);
        }
    }

    private Boolean isAllowedBank(InstituicaoBancaria instituicaoBancaria) {
        return switch (instituicaoBancaria) {
            case NUBANK -> false;
            default -> true;
        };
    }

    @Override
    public String toString() {
        return "Conta Poupança " + instituicaoBancaria.getBanco() + " " + numeroConta;
    }

}
