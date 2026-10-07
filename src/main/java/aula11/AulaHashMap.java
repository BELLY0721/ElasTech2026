package aula11;

import java.util.HashMap;

public class AulaHashMap {

    static void main(String[] args) {

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane", "11 99999-9999");
        emails.put("Paloma", "22 8888-8888");
        emails.put("Mary", "99 3333-3333");


        emails.put("Ane", "ane@gmail.com");
        emails.put("Paloma", "paloma@gmail.com");
        emails.put("posicao 2", "qualquer coisa");

        System.out.println(emails.get("Ane"));
        System.out.println(emails.get("posicao 2"));
        System.out.println(emails.get("olá"));
        System.out.println(emails.getOrDefault("olá", "Posição inválida"));

        System.out.println(emails.getOrDefault(1, "Posição Inválida"));
        System.out.println(emails.keySet());
        System.out.println(emails.values());
        System.out.println(emails.containsKey("Maria"));




    }
}