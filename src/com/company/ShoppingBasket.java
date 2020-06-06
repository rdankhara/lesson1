package com.company;

import java.util.ArrayList;

public class ShoppingBasket implements Basket {
    ArrayList<OrderItem> items;

    public ShoppingBasket() {
        //items = new
    }

    @Override
    public boolean add(OrderItem item) {
        return false;
    }

    @Override
    public boolean remove(OrderItem item) {
        return false;
    }
}
