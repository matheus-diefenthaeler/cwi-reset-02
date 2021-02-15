public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovel;
    private int prazo;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int prazo) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazo = prazo;
    }


    private void imprimirPropostaAprovada(){
        System.out.println("Parabéns! " + this.beneficiario.getNome() + " Seu " + this.imovel.apresentacao() + "\n Será financiado em " + this.prazo + " meses!!!");
    }

    private void imprimirPropostaNegada(){
        System.out.println("Pelo amor... " + this.beneficiario.getNome() + ", por acaso esqueceu quanto tu ganha ? " + "o " +
                this.imovel.apresentacao() + "\n Não pode ser financiado em " + this.prazo + " mês(es)!!!");

    }


    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {


    if((this.beneficiario.getSalario() * this.prazo) < (this.imovel.getValor()*0.50) ){
        this.imprimirPropostaNegada();
    }else if (this.imovel.getEndereco().getEstado().equals(UnidadeFederativa.SAO_PAULO) && (this.beneficiario.getSalario() * this.prazo) < (this.imovel.getValor()*0.65)){
        imprimirPropostaAprovada();
    }else if (this.imovel.getEndereco().getEstado().equals(UnidadeFederativa.RIO_DE_JANEIRO) && (this.beneficiario.getSalario() * this.prazo) < (this.imovel.getValor()*0.60)){
        imprimirPropostaAprovada();
    }else{
        imprimirPropostaAprovada();
    }



    }
}