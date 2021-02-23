package br.com.banco.desgraca.domain.conta;
import br.com.banco.desgraca.domain.InstituicaoBancaria;

public abstract class Conta implements ContaBancaria{
    private Conta conta;
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

    public Conta getConta(){
        return conta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    public Double getSaldo() {
        return saldo;
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
        return null;
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta " + getInstituicaoBancaria() + " " + this.numeroConta;
    }



}
