package aula04;

public class EntradaExercicio4 {
    static void main() {

        // LOGICAL OPERATORS (OPERADORES LÓGICOS)
        // && → AND (E) → as duas condições precisam ser true
        // || → OR (OU) → pelo menos uma condição precisa ser true

        /* 4 — Crie variáveis idade (17) e temAutorizacao (true).
        Mostre se a pessoa pode entrar na festa:
        precisa ter 18 anos ou ter autorização. Faça o mesmo para
        precisa ter 18 anos e ter autorização.*/

        int idade = 17;
        boolean temAutorizacao = true;

        if (idade >= 18 || temAutorizacao) {
            System.out.println("OU (||): Pode entrar porque tem autorização.");
        }

        if (idade >= 18 && temAutorizacao) {
            System.out.println("E (&&): Pode entrar porque tem 18 anos e autorização.");
        }

    }
}
