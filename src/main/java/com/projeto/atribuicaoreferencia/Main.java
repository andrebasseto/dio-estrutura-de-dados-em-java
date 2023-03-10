package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        /*
        tipos primitivos
        copiar exatamente o valor que esta na memoria
         */
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + " intB= " + intB);

        intA = 2;

        System.out.println("intA= " + intA + " intB= " + intB);


        /*
        Objeto
        o objeto não é copiado, mas sim a referencia de memoria, as duas variaveis irão apontar para o mesmo endereço de memoria
         */
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA= " + objA + " objB= " + objB);

        objA.setNum(2);
        System.out.println("objA= " + objA + " objB= " + objB);


    }
}
