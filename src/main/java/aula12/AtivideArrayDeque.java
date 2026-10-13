package aula12;

import java.util.LinkedList;
import java.util.Queue;

class AtividadeArrayDeque {

    static void main(String[] args) {


        /*QUEUE (FILA)
        .add()      → adiciona
        .peek()     → olha o primeiro
        .poll()     → remove o primeiro
        .contains() → verifica se existe
        .isEmpty()  → verifica se está vazia

        peek() olha, poll() remove.
        A fila segue a ordem de chegada: o primeiro a entrar é o primeiro a sair.*/


        /*1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
        e quantas pessoas tem.*/

        Queue<String> fila = new LinkedList<>();

        fila.add("Bia");
        fila.add("Nana");
        fila.add("Zoe");

        System.out.println(fila);
        System.out.println("Quantidade de pessoas: " + fila.size());


        /*2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        imprima a fila logo depois. Repare que ela não mudou.*/

        Queue<String> fila2 = new LinkedList<>();

        fila2.addAll(java.util.List.of("Nana", "Zoe", "Sara"));

        System.out.println("Próxima pessoa: " + fila2.peek());
        System.out.println("Fila depois do peek: " + fila2);


        /*3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        depois. Compare com o exercício 2.*/

        Queue<String> fila3 = new LinkedList<>();

        fila3.addAll(java.util.List.of("Lili", "Zoe", "Ana"));

        System.out.println("Pessoa atendida: " + fila3.poll());
        System.out.println("Fila depois do poll: " + fila3);


        /*4. Crie uma fila com três nomes e atenda todos usando
         while (!fila.isEmpty()). No final, imprima "Fila vazia!".*/

        Queue<String> fila4 = new LinkedList<>();

        fila4.add("Bia");
        fila4.add("Zoe");
        fila4.add("Ana");

        while (!fila4.isEmpty()) {
            System.out.println("Pessoa atendida: " + fila4.poll());
        }

        System.out.println("Fila vazia!");


        /*5. Crie uma fila com três nomes e use contains para responder duas
        perguntas: se "Bia" está na fila e se "Zoe" está.*/

        Queue<String> fila5 = new LinkedList<>();

        fila5.add("Bia");
        fila5.add("Ana");
        fila5.add("Carlos");

        System.out.println("Bia está na fila? " + fila5.contains("Bia"));
        System.out.println("Zoe está na fila? " + fila5.contains("Zoe"));


        /*6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        - se estiver vazia  -> "Não tem ninguém na fila."
        - se tiver gente    -> "Próximo: [nome]"
        Depois adicione uma pessoa e teste de novo.*/


        Queue<String> fila6 = new LinkedList<>();

        if (fila6.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila6.peek());
        }

        fila6.add("Bia");

        if (fila6.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila6.peek());
        }






    }
}