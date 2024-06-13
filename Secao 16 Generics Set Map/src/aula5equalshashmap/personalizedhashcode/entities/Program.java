package aula5equalshashmap.personalizedhashcode.entities;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Olga", "olgamariasssantos@gmail.com");
        Client client2 = new Client("Olga", "olgamariasssantos@gmail.com");

        System.out.println(client.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client.equals(client2));

        System.out.println(client == client2); // Compara as referencias da memoria
    }
}
