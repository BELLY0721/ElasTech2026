package aula04;

public class CardapioExercicio3 {

    public static void main(String[] args) {

        // SWITCH (ESCOLHER UMA OPÇÃO)
// Checks the value of a variable and chooses a matching case.
// (Verifica o valor de uma variável e escolhe o case correspondente.)
//
// case    → option (opção)
// break   → stops the switch (para o switch)
// default → if no case matches (se nenhum case corresponder)

         /* 3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch,
         mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente
         e 4 é Chá. Qualquer outro número mostra "Opção inválida".*/


        int opcao = 3;

        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;

            case 2:
                System.out.println("Cappuccino");
                break;

            case 3:
                System.out.println("Chocolate quente");
                break;

            case 4:
                System.out.println("Chá");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}