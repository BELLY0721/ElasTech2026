package aula02;

public class Concatenacao {
    static void main() {

        // Concatenacao

        // Concatenation = joining text and variables using the + operator.
        //
        // Example:
        // "Hello " + nome
        //
        // The + symbol can join Strings, numbers and variables.


       /* 1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha:
       "Meu nome é Beli, moro em Sao Paulo e tenho 25 anos." */

        String nome = " Oxford e Beli";
        String cidade = " São Paulo-SP";
        int idade = 25;

        System.out.println(" Exercicio 1: Olá! Meu nome é " + nome + ", moro em" + cidade + " e tenho " + idade + " anos.");


        /* 2 — Crie variáveis para o nome de um produto ("Talheres"), o preço (11.99) e a quantidade (12).
        Mostre: "Comprei 12 unidades de Caneca por R$ 11.99 cada. Total: R$ 143.88" */

        String produto = "Talheres";
        double preco = 11.99;
        int quantidade = 12;
        double total = 143.88;

        System.out.println(" Exercicio 2: Comprei " + quantidade + ", unidades de " + produto + " por R$ " + preco + " cada. Total: " + total + ".");


        // 3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        int soma1 = 15;
        int soma2 = 4;
        int resultado = 19;

        System.out.println(" Exercicio 3: A soma de " + soma1 + " e " + soma2 + " é igual a " + resultado+ ".");


    }
}
