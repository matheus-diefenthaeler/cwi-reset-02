public class Apartamento extends Imovel{

    private Integer andar;

    public Apartamento(Double valor, Endereco endereco, Integer andar) {
        super(endereco,valor);
        this.andar = andar;
    }

    public Integer getAndar() {
        return andar;
    }

    @Override
    public String apresentacao() {
        return getEndereco().descricaoEndereco2() + "\nApartamento no andar numero " + getAndar() + "\nEsse belo apê está saindo pelo valor de: R$" + getValor();
    }

}
