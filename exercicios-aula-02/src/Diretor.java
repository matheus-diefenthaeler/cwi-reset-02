public class Diretor {

    private String nomeDiretor;
    private int idadeDiretor;
    private int filmesDirigidos;

    public Diretor(String nomeDiretor, int idadeDiretor, int filmesDirigidos) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.filmesDirigidos = filmesDirigidos;
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
}
