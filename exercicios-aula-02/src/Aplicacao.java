public class Aplicacao {

    public static void main(String[] args) {

        Diretor stephenKing = new Diretor("Stephen King", 67, 10,Genero.MASCULINO);
        Filme filme1 = new Filme("A Espera de um Milagre", "Bla bla bla", 180,1980,8,stephenKing);

        Diretor quentin = new Diretor("Quentin Tarantino", 57, 8,Genero.MASCULINO);
        Filme filme2 = new Filme("Pulp Fiction", "Bla bla bla", 120,1996,10,quentin);

        Ator ator1= new Ator("Jhonny Depp", 50, 1, Genero.MASCULINO);
        //filme1.reproduzirFilme();
        //filme2.reproduzirFilme();


        ator1.infoAtor();
        stephenKing.infoDiretor();





    }


}
