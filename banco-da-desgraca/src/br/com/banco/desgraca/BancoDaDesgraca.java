package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        try {

            ContaCorrente conta1 = new ContaCorrente(1234,InstituicaoBancaria.ITAU);
            ContaDigital conta2 = new ContaDigital(5672,InstituicaoBancaria.NUBANK);
            conta1.depositar(500.0);
            conta1.sacar(150.0);
            conta1.sacar(90.0);
            conta1.sacar(10.0);
            conta1.transferir(50.0,conta2);
            conta2.sacar(10.0);
            conta2.depositar(150.0);
            conta2.depositar(300.0);
            conta2.transferir(100.0,conta1);
            //conta2.sacar(1000.0);
            conta2.transferir(1000.0,conta1);
            //conta1.exibirExtrato(null,null);
            //conta2.exibirExtrato(null,null);
            //conta1.exibirExtrato(null,LocalDate.of(2020,8,15));
            //conta2.exibirExtrato(LocalDate.of(2020,7,1),null);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nO programa chegou ate o fim! =)");

    }
}