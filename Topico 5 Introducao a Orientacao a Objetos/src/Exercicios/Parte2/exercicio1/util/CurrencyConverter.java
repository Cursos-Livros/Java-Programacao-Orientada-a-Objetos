package Exercicios.Parte2.exercicio1.util;

public class CurrencyConverter {

    public static final double IOF = 6.0 / 100;

    public static double convertCurrency(double dollarPrice, double dollarQuantity) {
        return dollarQuantity * dollarPrice * iof(dollarPrice, dollarQuantity);
    }

    private static double iof(double dollarPrice, double dollarQuantity) {
        return 1.0 + IOF;
    }
}
