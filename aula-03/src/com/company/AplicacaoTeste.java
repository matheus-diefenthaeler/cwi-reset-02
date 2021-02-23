package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumerador.Genero;
import com.company.herenca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) {

//        Editora a = new Editora("DC Comics", "Rua aleatoria");
//        Editora b = new Editora("Marvel", "Rua aleatoria");
//
//        System.out.println("Editora: " + a.getNome());
//        System.out.println("Editora: " + b.getNome());

        Filme filme = new Filme("ASIUH","auiysgha",12,1991,4,new Diretor("aiush",12,1, Genero.MASCULINO));
        filme.reproduzir();

    }

}
