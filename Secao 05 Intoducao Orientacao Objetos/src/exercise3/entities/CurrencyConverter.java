package exercise3.entities;

public class CurrencyConverter {
    public static double converter(double dollarPrice, double dollarBuy) {
        double dollarAmount = dollarPrice * dollarBuy;
        double iofCalculating = dollarAmount * 0.06;

        return dollarAmount + iofCalculating;
    }
}
