package aula12;

import java.util.HashMap;

public class AtividadeHashMap {

    static void main(String[] args) {

        /* HASHMAP
        .put()         → adiciona ou atualiza
        .get()         → busca o valor
        .size()        → conta os pares
        .containsKey() → verifica se a chave existe
        .getOrDefault()→ retorna um padrão se não existir
        .remove()      → remove um par

        Chave repetida no put() → atualiza o valor.
        get() sem chave existente → retorna null.*/


        /* 1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        inteiro e depois use get para mostrar a idade de uma delas.*/

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Bia", 25);
        pessoas.put("Zoe", 30);
        pessoas.put("Ana", 22);

        System.out.println(pessoas);
        System.out.println(pessoas.get("Bia"));


        /*2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
        imprima, e depois faça put de "café" DE NOVO com valor 7.50.
        Imprima outra vez e veja o que aconteceu com o tamanho.*/

        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("café", 5.00);
        System.out.println(produtos);

        produtos.put("café", 7.50);
        System.out.println(produtos);
        System.out.println(produtos.size());


        /*3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
        dentro de um if para mostrar o telefone de alguém que está na agenda
        e de alguém que não está.*/

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Bia", "1131799-2332");
        agenda.put("Ana", "1194488-1455");

        if (agenda.containsKey("Bia")) {
            System.out.println(agenda.get("Bia"));
        }

        if (agenda.containsKey("Zoe")) {
            System.out.println(agenda.get("Zoe"));
        } else {
            System.out.println("Zoe não está na agenda.");
        }


        /*4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        Use getOrDefault para mostrar a quantidade de um produto que existe
        e de um que não existe (devolvendo 0). Depois tente com get normal
        no que não existe e compare.*/

        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Pão", 10);
        estoque.put("Carne", 5);

        System.out.println(estoque.getOrDefault("Pão", 0));
        System.out.println(estoque.getOrDefault("leite", 0));
        System.out.println(estoque.get("leite"));


        /*5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
        Remova uma delas e imprima de novo.*/

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Saki", 9.0);
        notas.put("Zoe", 8.5);
        notas.put("Ana", 7.0);

        System.out.println(notas);
        System.out.println(notas.size());

        notas.remove("Zoe");

        System.out.println(notas);
        System.out.println(notas.size());

    }
}
