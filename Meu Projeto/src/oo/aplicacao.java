package oo;

import org.w3c.dom.ls.LSOutput;

public class aplicacao {
    public static void main(String[] args) {

        Calculadora calcular = new Calculadora();
        int resultadoSoma = calcular.soma(1,2);
        int resultadoSubtrai = calcular.subtrai(1,2);
        int resultadoMulti = calcular.multiplicacao(2,3);
        float resultadoDiv = calcular.divisao(6,2);
        System.out.println("O resultado da soma é: " + resultadoSoma);
        System.out.println("O resultado da subtração é: " + resultadoSubtrai);
        System.out.println("O resultado da multiplicação é: " + resultadoMulti);
        System.out.println("O resultado da divisão é: " + resultadoDiv);

    }

}