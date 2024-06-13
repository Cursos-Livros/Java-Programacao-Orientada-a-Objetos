package exercicio2.entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    LocalDate manufatureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    public LocalDate getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(LocalDate manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) - Price: $" + String.format("%.2f", super.getPrice()) +
                " (Manufacture date: " + manufatureDate + ")";
    }
}
