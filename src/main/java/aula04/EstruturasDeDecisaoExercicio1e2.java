package aula04;

public class EstruturasDeDecisaoExercicio1e2 {
    static void main() {

        // CONDITIONAL STRUCTURES (ESTRUTURAS CONDICIONAIS)
        // if  →  if (se)
        // else if  →  else if (senão, se)
        // else  →  else (senão)



        /*1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança",
         de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".*/

        int idade = 13;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }


        /* 2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
        Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante.
        Se não for, mostre "Saldo insuficiente" e quanto está faltando.*/

        double saldo1 = 500.00;
        double valorCompra1 = 320.00;
        if (saldo1 >= valorCompra1) {
            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante: " + (saldo1 - valorCompra1));

        }
        double saldo2 = 220.00;
        double valorCompra2 = 320.00;

        if (saldo2 >= valorCompra2) {
            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante: " + (saldo2 - valorCompra2));
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Falta: " + (valorCompra2 - saldo2));
        }










    }
}


