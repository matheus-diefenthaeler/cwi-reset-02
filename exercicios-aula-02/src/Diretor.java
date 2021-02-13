import java.security.CodeSigner;

public class Diretor extends Pessoa {

    private int filmesDirigidos;


    public Diretor(String nome, int idade, Genero genero, int filmesDirigidos) {
        super(nome,idade,genero);
        this.filmesDirigidos = filmesDirigidos;

    }

    public void infoPessoa(){
        super.infoPessoa();
    }

}
