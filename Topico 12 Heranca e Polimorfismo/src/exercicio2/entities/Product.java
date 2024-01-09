package exercicio2.entities;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        return name + " $" + price;
    }

    public static Product makeCommomProduct(String nameProduct, Double priceProduct) {
        Product commomProduct = new Product(nameProduct, priceProduct);
        return commomProduct;
    }
}
