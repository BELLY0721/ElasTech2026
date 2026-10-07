package aula11;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    static void main(String[] arg ) {

        /*ARRAYLIST — PRINCIPAIS COMANDOS
        .add()       → adiciona um elemento
        .add(posição, valor) → adiciona em uma posição específica
        .addAll()    → adiciona vários elementos
        .get()       → pega um elemento pela posição
        .set()       → troca um elemento
        .remove()    → remove um elemento
        .size()      → conta quantos elementos existem
        .contains()  → verifica se existe um elemento
        .indexOf()   → mostra a posição de um elemento
        .isEmpty()   → verifica se a lista está vazia
        IMPORTANTE:As posições começam no ZERO.
        posição:  0   1   2   3
        lista:   [A,  B,  C,  D]*/

        //Referência:
        //nomes.add("Carla");          // adiciona no fim
        //nomes.get(0);                // pega pela posição
        //nomes.size();                // quantos tem
        //nomes.set(0, "Zoe");         // troca o valor da posição
        //nomes.remove(1);             // remove pela posição
        //nomes.contains("Ana");       // true ou false
        //nomes.indexOf("Bia");        // em que posição está
        //nomes.isEmpty();             // true se está vazia


        //1.Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        ArrayList<String> nomes1 = new ArrayList<>();

        nomes1.add("Ana");
        nomes1.add("Bia");
        nomes1.add("Beli");

        System.out.println(nomes1);

        //2.Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> frutas = new ArrayList<>(List.of("Morango", "Kiwi", "Laranja", "Uva"));

        System.out.println(frutas.get(0));
        System.out.println(frutas.get(frutas.size() - 1));
        System.out.println(frutas.size());

       //3.Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList<String> nomes2 = new ArrayList<>(
                List.of("Ana", "Bia", "Carla", "Duda")
        );

        System.out.println(nomes2);

        nomes2.set(2, "Maria");

        System.out.println(nomes2);


        //4.Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String> cidades = new ArrayList<>(List.of("São Paulo", "Rio de Janeiro", "Salvador", "Recife"));

        cidades.remove(1);

        System.out.println(cidades);
        System.out.println(cidades.size());


        //5.Crie uma lista com seis nomes. Imprima todos usando um laço.

        ArrayList<String> nomes3 = new ArrayList<>(List.of("Ana", "Bia", "Carla", "Duda", "Eva", "Fernanda"));

        for (int i = 0; i < nomes3.size(); i++) {
            System.out.println(i + ": " + nomes3.get(i));
        }


        /*6. Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
        Se não estiver, avise.*/

        ArrayList<String> nomes4 = new ArrayList<>(List.of("Ana", "Bia", "Carla", "Duda", "Eva"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        if (nomes4.contains(nome)) {
            System.out.println("O nome está na lista.");
            System.out.println("Posição: " + nomes4.indexOf(nome));
        } else {
            System.out.println("O nome não está na lista.");
        }




    }
}
