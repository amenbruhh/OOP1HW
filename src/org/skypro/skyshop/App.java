package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.discountedProduct.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.simpleProduct.SimpleProduct;

public class App {

    public static void main(String[] args) {


        SimpleProduct chips = new SimpleProduct("Lays", 150);
        SimpleProduct milk = new SimpleProduct("Постоквашино", 98);
        SimpleProduct catFood = new SimpleProduct("Whiskas", 25);

        DiscountedProduct chickenBreast = new DiscountedProduct("Куриная грудка", 300, 15);
        DiscountedProduct buckwheat = new DiscountedProduct("Гречка", 60, 10);
        DiscountedProduct eggs = new DiscountedProduct("Яйца", 120, 10);

        ProductBasket basket = new ProductBasket();
        basket.addProduct(chips);
        basket.addProduct((milk));
        basket.addProduct(catFood);
        basket.addProduct(chickenBreast);
        basket.addProduct(buckwheat);
        basket.addProduct(eggs);

        basket.printCartContents();

        System.out.println("Есть ли гречка в корзине? " + basket.containsProduct("Гречка"));
        System.out.println("Есть ли Snickers в корзине? " + basket.containsProduct("Snickers"));

        basket.clearBasket();

        basket.printCartContents();

        System.out.println("Есть ли гречка в корзине? " + basket.containsProduct("Гречка"));

    }
}