package org.skypro.skyshop.product;

public class Product {

    private final String nameOfProduct;
    private final int price;

    public Product(String nameOfProduct, int price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public String getName() {
        return this.nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

}
