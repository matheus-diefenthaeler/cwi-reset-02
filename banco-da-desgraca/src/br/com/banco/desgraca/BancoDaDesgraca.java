package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        try{

            ContaPoupanca conta1 = new ContaPoupanca(123, InstituicaoBancaria.NUBANK);
            conta1.depositar(500.0);

            System.out.println(conta1.getSaldo());


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nO programa chegou ate o fim! =)");


    }
}