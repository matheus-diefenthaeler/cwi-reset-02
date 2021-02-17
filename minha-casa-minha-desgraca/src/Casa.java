public class Casa extends Imovel{

    private Patio patio;

    public Casa(Double valor, Endereco endereco) {
        super(endereco, valor);
    }

    public Casa(Double valor, Endereco endereco, Patio patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    public boolean hasPatio(){
      return patio != null;
    }

    @Override
    public String apresentacao(){
        String patio = "";
        if(hasPatio()){
            patio = this.patio.getPatioInfo();
        }
        return getEndereco().descricaoEndereco2() + patio + "\nTudo isso pelo valor de R$ " + getValor() + "!!";
    }

}
