public class Imovel{

    private Double valor;
    private Endereco endereco;

    public Imovel(Double valor, Endereco endereco) {
        this.valor = valor;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }


    public String apresentacao(){
        return this.endereco.descricaoEndereco() + " Com o valor de: R$" + this.getValor();
    }


}
