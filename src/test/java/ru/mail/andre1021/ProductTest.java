package ru.mail.andre1021;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void task_6(){
        Basket magaz = new MyBasketIml();
        magaz.addProduct("Футболка", 1);
        magaz.addProduct("Футболка_2", 5);
        magaz.addProduct("Футболка_6", 6);

        magaz.updateProductQuantity("Футболка_2", 2);

        magaz.removeProduct("Футболка");

        Assert.assertEquals(2, magaz.getProducts().size());

        Assert.assertEquals(2, magaz.getProductQuantity("Футболка"));
        magaz.clear();
        Assert.assertEquals(0, magaz.getProducts().size());
    }
}
