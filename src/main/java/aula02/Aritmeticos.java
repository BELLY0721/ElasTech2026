package aula02;

public class Aritmeticos {

    public static void main(String[] args) {

// Arithmetic operators = operators used to perform math calculations:
// +  Addition       → adds numbers
// -  Subtraction    → subtracts numbers
// *  Multiplication → multiplies numbers
// /  Division       → divides numbers
// %  Remainder      → gives the remainder

        exercicio0();
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        desafio();

    }

    static void exercicio0() {
        // 0- Rode esses códigos:

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        /*O primeiro realiza uma concatenação porque existe uma String antes dos números.
        Por isso, o resultado é 22.

        O segundo realiza a soma primeiro porque o cálculo está entre parênteses.
        Por isso, o resultado é 4.*/


    }

    static void exercicio1() {
        /* 1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela:
        soma, subtração, multiplicação, divisão e resto.*/

        int numero1 = 10;
        int numero2 = 3;
        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        int resto;

        soma = numero1 + numero2;
        System.out.println("Soma " + soma);

        subtracao = numero1 - numero2;
        System.out.println( "Subtração " + subtracao);

        multiplicacao = numero1 * numero2;
        System.out.println( "Multiplicação " + multiplicacao);

        divisao = numero1 / numero2;
        System.out.println( "Divisão " + divisao);

        resto = numero1 % numero2;
        System.out.println( "Resto " + resto);
    }

    static void exercicio2() {
        /*2- Crie variáveis para dois números decimais de valor a = 10.7 e b = 3.5 e mostre na tela:
        soma, subtração, multiplicação, divisão e resto.*/

        double decimal1 = 10.5;
        double decimal2 = 3.5;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        double resto;

        soma = decimal1 + decimal2;
        System.out.println("Soma " + soma);

        subtracao = decimal1 - decimal2;
        System.out.println( "Subtração " + subtracao);

        multiplicacao = decimal1 * decimal2;
        System.out.println( "Multiplicação " + multiplicacao);

        divisao = decimal1 / decimal2;
        System.out.println( "Divisão " + divisao);

        resto = decimal1 % decimal2;
        System.out.println( "Resto " + resto);

    }

    static void exercicio3() {
        // 3-Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
    }

    static void exercicio4() {
        //4-Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.

        int a = 3;
        int b = 4;
        int c = 5;
        int resultado = a + b * c;

        System.out.println("Resultado: " + resultado);
    }

    static void exercicio5() {
        //5-Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.

        int a = 3;
        int b = 4;
        int c = 5;

        int resultado = (a + b) * c;

        System.out.println("Resultado: " + resultado);
    }

    static void desafio(){

        //Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

        int segundos = 3785;

        System.out.println("Minutos inteiros: " + (segundos / 60) + " E sobram: " + (segundos % 60));

    }
}
