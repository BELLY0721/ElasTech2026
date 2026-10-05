package aula03;

public class OperadoresRelacionais {

    static void main() {

        // Used to compare two values (usados para comparar dois valores)
        // The result is always true or false (o resultado é sempre verdadeiro ou falso)
        //
        // ==  Equal to (igual a)
        // !=  Not equal to (diferente de)
        // >   Greater than (maior que)
        // <   Less than (menor que)
        // >=  Greater than or equal to (maior ou igual a)
        // <=  Less than or equal to (menor ou igual a)



       /* 1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de:
       são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        */

        int a1 = 10;
        int b1 = 3;

        int a2 = 3;
        int b2 = 10;

        int a3 = 5;
        int b3 = 5;

        int a4 = 2;
        int b4 = 2;

        int a = 10;
        int b = 3;

        boolean chovendo = true;

        if (a1 > b1) {
            System.out.println("Entre a1 e b1: a1 é maior");
            System.out.println(a1);}

        if (a2 < b2) {
            System.out.println("Entre a2 e b2: a2 é menor");
            System.out.println(a2);}

        System.out.println(a4 != b4);

        if (a3 == b3) {
            System.out.println(a3 == b3);
        }


        // 2- Exiba na tela  aa == bb, sendo aa = 10 e bb 3.

        int aa = 10;
        int bb = 3;

        System.out.println(aa == bb);

        // 3- Exiba na tela aa != bb, sendo cc = 10 e dd = 3.

        int cc = 10;
        int dd = 3;

        System.out.println(cc != dd);

        // 4- Dado boolean ventando = true, retorne na tela o resultado de !ventando

        boolean ventando = true;

        System.out.println(!ventando);

    }
}
