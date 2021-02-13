package banco;

/*  Praticando!

Exercício - Conta Banco

Criar uma classe que contenha os atributos:
Tipo da conta (Corrente ou Poupanca), Titular da conta, Saldo e Status (aberta ou fechada).

Metodos:
abrirConta() - Se for Poupanca adicionar 150.0 no saldo se for Corrente adicionar 50.0
fecharConta() - Fechar a conta apenas se o saldo estiver zerado.
deposita()
saca()
 */


public class Main {

    public static void main(String[] args) {

    ContaBanco matheus = new ContaBanco();


        matheus.abrirConta("Matheus","CC");
        matheus.depositar(2900.0);
        matheus.sacar(950.0);
        matheus.pagarMensal();
        matheus.statusGeral();
        matheus.fecharConta();
        matheus.sacar(1988.0);
        matheus.fecharConta();
        matheus.statusGeral();


    }


}
