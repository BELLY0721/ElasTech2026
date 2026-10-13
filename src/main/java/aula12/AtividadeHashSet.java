package aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;

public class AtividadeHashSet {
    static void main(String[] args) {


    /*HASHSET
.add()      → adiciona
.addAll()   → adiciona vários
.contains() → verifica se existe
.remove()   → remove
.size()     → conta elementos
.isEmpty()  → verifica se está vazio
for         → percorre os elementos

HashSet não aceita repetidos e não garante a ordem.
ArrayList aceita repetidos e permite acessar por posição.

new HashSet<>(lista) → remove os repetidos da lista.*/

        /*1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        com o repetido.*/

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Siri");
        nomes.add("Bia");
        nomes.add("Siri");
        nomes.add("Tamara");

        System.out.println(nomes);
        System.out.println(nomes.size());

        // Retornou 3 em vez de 4 porque um dos nomes está repetido.
        // O HashSet não permite valores repetidos, então ele ignora a repetição.


        /*2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        de um if para avisar se a cor "verde" já está no conjunto ou não.*/

        HashSet<String> cores = new HashSet<>();

        cores.addAll(java.util.List.of("amarelo", "verde", "laranja", "vermelho"));

        if (cores.contains("laranja")) {
            System.out.println("A cor laranja já está no conjunto.");
        } else {
            System.out.println("A cor laranja não está no conjunto.");
        }


        /*3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
        tirar os repetidos. Imprima os dois e compare.*/

        ArrayList<String> nomes1 = new ArrayList<>(
                java.util.List.of("Zara", "Beli", "Zara", "Carlos", "Beli")
        );

        HashSet<String> nomesSemRepetidos = new HashSet<>(nomes1);

        System.out.println("Lista original: " + nomes1);
        System.out.println("Lista sem repetidos: " + nomesSemRepetidos);


        /*4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        imprima de novo, junto com o tamanho.*/


        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("12345675500");
        cpfs.add("32765132100");
        cpfs.add("50722233354");

        System.out.println("CPFs antes da remoção: " + cpfs);

        cpfs.remove("32765132100");

        System.out.println("CPFs depois da remoção: " + cpfs);
        System.out.println("Quantidade de CPFs: " + cpfs.size());


        /*5. Crie um HashSet com três frutas e percorra ele com for
        imprimindo uma por linha.*/

        HashSet<String> frutas = new HashSet<>();

        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Uva");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }


        /*6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor
        imprima o isEmpty() de novo.*/

        HashSet<String> nomesVazios = new HashSet<>();

        System.out.println(nomesVazios.isEmpty());

        nomesVazios.add("Beli");

        System.out.println(nomesVazios.isEmpty());











    }
}
