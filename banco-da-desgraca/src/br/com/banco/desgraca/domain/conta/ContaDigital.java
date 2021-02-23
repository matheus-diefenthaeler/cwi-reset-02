package br.com.banco.desgraca.domain.conta;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.ContaException;

import java.time.LocalDate;

public class ContaDigital extends Conta {

    public ContaDigital(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) throws ContaException {
        super(numeroConta, instituicaoBancaria);
        if(!isAllowedBank(instituicaoBancaria)){
            throw new ContaException("Não é possui criar uma conta digital no banco " + instituicaoBancaria.getBanco());
        }
    }


    @Override
    public void sacar(Double valor) {
        if (valor >= 10 && this.saldo >= 10) {
            this.saldo -= valor;
        }
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
    }

    private Boolean isAllowedBank(InstituicaoBancaria instituicaoBancaria) {
        return switch (instituicaoBancaria) {
            case NUBANK, ITAU -> true;
            default -> false;
        };
    }


}
