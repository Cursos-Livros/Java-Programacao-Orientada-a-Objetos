package aula9map.exemplo1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("fone", "43996214945");

        cookies.put("fone", "43992214946"); // Sobrescreveu

        System.out.println("Contem chave fone: " + cookies.containsKey("fone"));
        System.out.println("phone number: " + cookies.get("fone"));
        System.out.println("Email: " + cookies.get("Email"));

        System.out.println();

        System.out.println("All cookies");
        System.out.println(cookies.toString());
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
