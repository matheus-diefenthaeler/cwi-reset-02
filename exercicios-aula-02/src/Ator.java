public class Ator extends Pessoa{


    private Integer numeroDeOscars;


    public Ator(String nome, Integer idade, Genero genero,Integer numeroDeOscars) {
        super(nome,idade,genero);
        this.numeroDeOscars = numeroDeOscars;
    }

    public void infoPessoa(){
       super.infoPessoa();
    }

}
