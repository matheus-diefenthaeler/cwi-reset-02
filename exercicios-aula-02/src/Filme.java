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

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void reproduzirFilme(){

        System.out.println("Nome do filme: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Nome do Diretor: " + diretor.getNome());
        System.out.println("\n");
    }

}
