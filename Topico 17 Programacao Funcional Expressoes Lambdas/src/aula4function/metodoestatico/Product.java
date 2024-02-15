package aula4function.metodoestatico;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String staticUpperCase(Product product) {
        return product.getName().toUpperCase();
    }

    @Override
    public String toString() {
        return name + "," + String.format("%.2f", price);
    }

}
