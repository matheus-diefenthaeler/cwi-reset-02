public class Aplicacao {

    public static void main(String[] args) {

        Diretor stephenKing = new Diretor("Stephen King", 67, Genero.MASCULINO, 7);
        Filme filme1 = new Filme("A Espera de um Milagre", "Bla bla bla", 180,1980,8,stephenKing);

        Diretor quentin = new Diretor("Quentin Tarantino", 57, Genero.MASCULINO,8);
        Filme filme2 = new Filme("Pulp Fiction", "Bla bla bla", 120,1996,10,quentin);

        Ator ator1= new Ator("Jhonny Depp", 50, Genero.MASCULINO, 1);
        //filme1.reproduzirFilme();
        //filme2.reproduzirFilme();


        ator1.infoPessoa();
        //stephenKing.infoPessoa();





    }


}
