package org.skypro.skyshop.discountedProduct;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {

    private int basePrise;
    private int discount;

    public DiscountedProduct(String nameOfProduct, int basePrise, int discount) {
        super(nameOfProduct);
        this.basePrise = basePrise;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%s: %d (%d%% скидка)",
                getName(), getPrice(), discount);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrice() {
        return basePrise * (100 - discount) / 100;
    }

    public int getBasePrise() {
        return basePrise;
    }

    public int getDiscount() {
        return discount;
    }
}
