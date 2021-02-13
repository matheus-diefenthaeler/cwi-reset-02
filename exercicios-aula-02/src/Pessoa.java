public class Pessoa {

    private String nome;
    private Integer idade;
    private Genero genero;

    public Pessoa(String nome, Integer idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void infoPessoa(){
        System.out.println("Nome do Ator: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + this.genero.getGenero() + "\n");
    }

}
