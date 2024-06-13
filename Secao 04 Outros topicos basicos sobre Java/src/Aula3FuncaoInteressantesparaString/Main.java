package Aula3FuncaoInteressantesparaString;

public class Main {
    public static void main(String[] args) {
        // Formatar: toLowerCase(), toUpperCase(), trim()
        // Recortar: substring(inicio), substring(inicio, fim)
        // Substituir: Replace(Char,Char), Replace(string,string)
        // Buscar: IndexOf, LastIndexOf
        // Dividir: Split("")

        String original = "abcde FGHIJ KlMn opqr STUvxy   opqr     ";

        // Formatar
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + original.toLowerCase() + "-");
        System.out.println("toUpperCase: -" + original.toUpperCase() + "-");
        System.out.println("trim: -" + original.trim() + "-");

        // Recortar
        System.out.println("substring(inicio): -" + original.substring(4) + "-");
        System.out.println("substring(inicio e fim): -" + original.substring(6, 10) + "-");

        // Substituir
        System.out.println("replace(esse, por esse): -" + original.replace("a", "x") + "-");
        System.out.println("replace(essa string, por essa string): -" + original.replace("abcde", "edcba") + "-");

        // Buscar
        System.out.println("IndexOf(c): -" + original.indexOf("c") + "-");
        System.out.println("LastIndexOf(c): -" + original.lastIndexOf("r") + "-");

        // Split
        String[] test = original.split(" ");
        System.out.println(test[0]);


    }
}
