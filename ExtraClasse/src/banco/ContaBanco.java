package banco;

public class ContaBanco {

    public String numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;


    public ContaBanco() {
        this.saldoConta = 0.0;
        this.statusConta = false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public void abrirConta(String nome, String tipoConta){

        if(tipoConta.equals("CC")){
            this.statusConta = true;
            this.setDonoConta(nome);
            this.setTipoConta("CC");
            this.saldoConta += 50.00;
        }else if(tipoConta.equals("CP")){
            this.statusConta = true;
            this.setDonoConta(nome);
            this.setTipoConta("CP");
            this.saldoConta += 150.00;
        }else{
            System.out.println("Conta nao cadastrada, digite CC para tipo Conta-corrente ou CP para tipoConta-poupanca");
        }
    }

    public void fecharConta(){
        if(this.getSaldoConta()!=0.0){
            System.out.println("A conta nao pode ser fechada pois possui um saldo de: " + this.getSaldoConta());
        }else{
            this.statusConta = false;
            this.setTipoConta("Conta encerrada.");
        }
    }

    public void sacar(double valor){
        this.saldoConta -= valor;
    }

    public void depositar(double valor){
        this.saldoConta += valor;
    }

    public void pagarMensal(){

        if(this.tipoConta.equals("CC")){
            this.saldoConta -= 12.0;
        }else if(this.tipoConta.equals("CP")){
            this.saldoConta -= 20.0;
        }else{
            System.out.println("Conta nao cadastrada!");
        }

    }

    public void statusGeral(){
        System.out.println("Dados da conta:\n");
        System.out.println("Nome do titular da conta: " + this.getDonoConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Saldo de: " + this.getSaldoConta());
        System.out.println("Conta esta aberta?" + this.statusConta);
    }




}
