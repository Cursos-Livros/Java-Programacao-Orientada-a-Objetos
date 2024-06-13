package Aula2OperadorBitWise;

public class Main {
    public static void main(String[] args) {
        // Bitwise operação bit a bit
        // Programação baixo nível

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2); // F & F = F | F & V = F | V & F = F | V & V = F
        System.out.println(n1 | n2); // F & F = F | F & V = V | V & F = V | V & V = V
        System.out.println(n1 ^ n2); // F & F = F | F & V = V | V & F = V | V & V = F
    }
}
