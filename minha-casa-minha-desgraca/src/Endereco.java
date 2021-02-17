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


    public String descricaoEndereco2(){
        StringBuilder builder = new StringBuilder();
        builder.append("Imovel situado no Estado de ").append(this.getEstado().getEstado());
        builder.append("\n").append("Cidade - ").append(this.getCidade());
        builder.append("\n").append("Bairro - ").append(this.getBairro());
        builder.append("\n").append("Rua - ").append(this.getLogradouro());
        builder.append("\n").append("Complemento - ").append(this.getComplemento());
        return builder.toString();
    }

    public String descricaoEndereco(){
        return "Imóvel situado no Estado: " + this.getEstado().getEstado() + "\nCidade: " + this.cidade + "\nBairro: " + this.bairro
                + "\nRua: " + this.logradouro + "\nNumero: " + this.numero + "\nComplemento: " + this.complemento;
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
