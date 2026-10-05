package aula04;

public class NotasDesafio {
    static void main() {

        /* Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre:
        "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5.
        Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.*/

         /*Ps: Utilize double para o valor das notas. Para controlar as casas decimais,
         use printf com o marcador %.2f onde você quer que apareça a média no seu texto
         (Troquem ele de lugar pra ver o que acontece), onde 2 é a quantidade de casas que você quer
         (Experimentem trocar por 3 e ver o que acontece). O texto e a pontuação vão dentro das aspas,
         e o \n no final pula a linha (ele funciona como  um enter para que tudo não fique colado
         um do lado do outro):*/

        //System.out.printf("Sua média é: %.2f\n", media);


        // IF / ELSE IF / ELSE
        // if → SE
        // else if → SENÃO, SE
        // else → SENÃO
        // printf → displays formatted text (mostra texto formatado)
        // %.2f → shows 2 decimal places (mostra 2 casas decimais)
        // \n → starts a new line (pula uma linha)
        // The program checks the conditions from top to bottom.
        // (O programa verifica as condições de cima para baixo.)



        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
    }
}
