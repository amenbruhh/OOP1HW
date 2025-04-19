package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {


        Product chips = new Product("Lays",  150);
        Product milk = new Product("Постоквашино", 98);
        Product catFood = new Product("Whiskas", 25);
        Product bread = new Product("Хлеб", 45);
        Product toiletPaper = new Product("Zeva", 150);
        Product beer = new Product("Балтика 9", 78);

        ProductBasket basket = new ProductBasket();
        basket.addProduct(chips);
        basket.addProduct((milk));
        basket.addProduct(catFood);
        basket.addProduct(beer);
        basket.addProduct(bread);
        basket.addProduct(toiletPaper);

        basket.printCartContents();

        System.out.println("Есть ли Lays в корзине? " + basket.containsProduct("Lays"));
        System.out.println("Есть ли Snickers в корзине? " + basket.containsProduct("Snickers"));

        basket.clearBasket();

        basket.printCartContents();

        System.out.println("Есть ли Lays в корзине? " + basket.containsProduct("Lays"));

    }
}