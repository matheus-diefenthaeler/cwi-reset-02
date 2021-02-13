import java.security.CodeSigner;

public class Diretor {

    private String nomeDiretor;
    private int idadeDiretor;
    private int filmesDirigidos;
    private Genero genero;

    public Diretor(String nomeDiretor, int idadeDiretor, int filmesDirigidos, Genero genero) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.filmesDirigidos = filmesDirigidos;
        this.genero = genero;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public int getIdadeDiretor() {
        return idadeDiretor;
    }

    public void setIdadeDiretor(int idadeDiretor) {
        this.idadeDiretor = idadeDiretor;
    }

    public int getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(int filmesDirigidos) {
        this.filmesDirigidos = filmesDirigidos;
    }

    public void infoDiretor() {
        System.out.println("Nome do Diretor: " + this.getNomeDiretor());
        System.out.println("Idade: " + this.getIdadeDiretor());
        System.out.println("Genero: " + this.genero.getGenero() + "\n");

    }


}
