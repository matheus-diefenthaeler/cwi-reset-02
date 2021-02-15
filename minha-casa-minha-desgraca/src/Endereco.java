public class Endereco {

    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederativa estado;


    public Endereco(String logradouro, Integer numero, String complemento, String bairro, String cidade, UnidadeFederativa estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String descricaoEndereco(){
        return "Imóvel situado no Estado: " + this.getEstado().getEstado() + " Cidade: " + this.cidade + " Bairro: " + this.bairro
                + " Rua: " + this.logradouro + " Numero: " + this.numero + " Complemento: " + this.complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }


}
