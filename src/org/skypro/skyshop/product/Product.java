package org.skypro.skyshop.product;

public abstract class Product {

    private final String nameOfProduct;

    public Product(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getName() {
        return nameOfProduct;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();

}
