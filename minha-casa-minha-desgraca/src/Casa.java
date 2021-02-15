public class Casa extends Imovel{
    private Double valor;
    private Endereco endereco;
    private boolean patio;


    public Casa(Double valor, Endereco endereco, boolean patio) {
        this.valor = valor;
        this.endereco = endereco;
        this.patio = patio;
    }


    @Override
    public Endereco getEndereco() {
        return this.endereco;
    }

    @Override
    public Double getValor() {
        return this.valor;
    }

    public String possuiPatio(boolean patio) {
        if(this.patio){
            return " Casa COM patio!";
        }else{
           return " Casa SEM patio!";
        }
    }

    @Override
    public String apresentacao(){
        return this.endereco.descricaoEndereco() + possuiPatio(this.patio) + " saindo no valor de: R$" + this.getValor();
    }






}
