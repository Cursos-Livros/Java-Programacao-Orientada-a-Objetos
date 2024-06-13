package aula2predicate.expressaolambdainline;

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

    // Static method usado no reference method
    public static Boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

}
