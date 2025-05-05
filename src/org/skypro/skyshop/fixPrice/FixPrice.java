package org.skypro.skyshop.fixPrice;

import org.skypro.skyshop.product.Product;

public class FixPrice extends Product {

    private static final int FIX_PRICE = 79;

    public FixPrice(String nameOfProduct) {
        super(nameOfProduct);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return String.format("%s: Фиксированная цена %d",
                getName(), FIX_PRICE);
    }
}
