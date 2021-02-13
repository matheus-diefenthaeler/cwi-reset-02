public class Ator {

    private String nome;
    private Integer idade;
    private Integer numeroDeOscars;
    private Genero genero;

    public Ator(String nome, Integer idade, Integer numeroDeOscars, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeOscars = numeroDeOscars;
        this.genero = genero;
    }


    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void infoAtor(){
        System.out.println("Nome do Ator: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Genero: " + this.genero.getGenero() + "\n");

    }



}
