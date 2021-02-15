public class Apartamento extends Imovel{

        private Double valor;
        private Endereco endereco;
        private Integer andar;

    public Apartamento(Double valor, Endereco endereco, Integer andar) {
        this.valor = valor;
        this.endereco = endereco;
        this.andar = andar;
    }

    public Integer getAndar() {
        return andar;
    }

    @Override
        public Endereco getEndereco() {
            return this.endereco;
        }

        @Override
        public Double getValor() {
            return this.valor;
        }

        @Override
        public String apresentacao() {
            return this.endereco.descricaoEndereco() + " Apartamento no ANDAR numero " +this.getAndar() + " Com o valor de: R$" + this.getValor();
        }

}
