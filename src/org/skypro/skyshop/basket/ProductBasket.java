package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;


public class ProductBasket {

    private final Product[] products;
    private int count;

    public ProductBasket() {
        this.products = new Product[5];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void printCartContents() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }

        int specialCount = 0;

        for (int i = 0; i < count; i++) {
            Product product = products[i];
            System.out.println(product.toString());

            if (product.isSpecial()) {
                specialCount++;
            }
        }

        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsProduct (String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
    public void clearBasket () {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }

}

