package _3ProcessamentoDadosJava;

public class Main {
    public static void main(String[] args) {
        // Boas Práticas
        // Valores Double 0.0
        // Valores float 2f

        //Casting
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) 5 / 2; // Cast para que 2 variaveis inteiras não de um inteiro e sim um double
        System.out.println(resultado);

        //Outro exemplo casting
        double c;
        int d;

        c = 5.0;
        d = (int) c; // Cast para que a variável d possa formatar a variavel c para int

        ; // Cast para que 2 variaveis inteiras não de um inteiro e sim um double
        System.out.println(d);
    }
}
