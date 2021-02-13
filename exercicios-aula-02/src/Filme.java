public class Filme {

    private String nome;
    private String descricao;
    private int duracao;
    private int ano;
    private int notaAvaliacao;
    private Diretor diretor;


    public Filme(String nome, String descricao, int duracao, int ano, int notaAvaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.notaAvaliacao = notaAvaliacao;
        this.diretor = diretor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

        public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void reproduzirFilme(){

        System.out.println("Nome do filme: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Nome do Diretor: " + diretor.getNomeDiretor());
        System.out.println("\n");
    }


}
