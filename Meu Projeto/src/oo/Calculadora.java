package oo;

public class Calculadora {

    public int ultimoResultado = 0;

    public int soma(int valor1, int valor2){
        ultimoResultado = valor1 + valor2;
        return ultimoResultado;
    }

    public int subtrai(int valor1, int valor2){
        ultimoResultado = valor1 - valor2;
        return ultimoResultado;
    }

    public int multiplicacao(int valor1, int valor2){
        ultimoResultado = valor1*valor2;
        return ultimoResultado;
    }

    public float divisao(int valor1, int valor2){
        ultimoResultado = valor1/valor2;
        return ultimoResultado;
    }


}