package com.company;

public class Cashdesk {
    private int totalPrice = 0;

    public Cashdesk() {
    }

    public void pay(Shoppingcart customer){
        System.out.println(customer.itemsInCart());
    }
}
