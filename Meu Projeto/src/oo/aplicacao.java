package oo;

import org.w3c.dom.ls.LSOutput;

public class aplicacao {

    public static void main(String[] args) {

// Exercicio 01
        System.out.println("Exercicio 01\n");

        Calculadora calcular = new Calculadora();
        int resultadoSoma = calcular.soma(1,2);
        int resultadoSubtrai = calcular.subtrai(1,2);
        int resultadoMulti = calcular.multiplicacao(2,3);
        float resultadoDiv = calcular.divisao(6,2);
        System.out.println("O resultado da soma é: " + resultadoSoma);
        System.out.println("O resultado da subtração é: " + resultadoSubtrai);
        System.out.println("O resultado da multiplicação é: " + resultadoMulti);
        System.out.println("O resultado da divisão é: " + resultadoDiv);
        System.out.println("");

// Exercicio 2
        System.out.println("Exercicio 02\n");

        Comparador comparar = new Comparador();
        boolean isMenor = comparar.menorQue(2,1);
        System.out.println(isMenor + "\n");


// Exercicio 3
        System.out.println("Exercicio 03\n");

        SituacaoAluno bruno = new SituacaoAluno("Bruno", 7);
        bruno.getSituacao();

        SituacaoAluno matheus = new SituacaoAluno("Matheus", 9);
        matheus.getSituacao();

    }

}