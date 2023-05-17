package ru.mail.andre1021;

import java.util.ArrayList;
import java.util.List;

public class MyBasketIml implements Basket {
    private List<String> product = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.product.add(product);
        }
    }

    @Override
    public void removeProduct(String product) {
            this.product.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {
product.clear();
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
