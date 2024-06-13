package Desafio.BarOO.entities;

public class Bill {
    public char gender = 'M';
    public int beer = 0;
    public int barbecue = 0;
    public int softDrink = 0;

    public double cover() {
        return 4.0;
    }

    public double feeding() {
        return (beer * 5.0) + (barbecue * 7.0) + (softDrink * 3.0);
    }

    public double ticket() {
        if (gender == 'F') {
            return 8.0;
        }
        return 10.0;
    }

    public double total() {
        double total = feeding() + ticket();
        if(total <= 30.0){
            return total + cover();
        }
        System.out.println("Isento de Covert");
        return total;
    }
}
