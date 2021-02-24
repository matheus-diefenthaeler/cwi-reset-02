package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        try {

            ContaPoupanca conta1 = new ContaPoupanca(123, InstituicaoBancaria.CAIXA);
            ContaCorrente conta2 = new ContaCorrente(456, InstituicaoBancaria.ITAU);
            conta1.depositar(500.0);
            conta1.consultarSaldo();
            System.out.println(conta1);
            System.out.println(conta2);
//            System.out.println(conta1.getSaldo());
//            conta1.transferir(150.0,conta2);
//            System.out.println(conta2.getSaldo());
//            System.out.println(conta1.getSaldo());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nO programa chegou ate o fim! =)");


    }
}