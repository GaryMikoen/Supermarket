package com.company;

import java.util.ArrayList;

public class Cashdesk {
    private double originalPrice = 0;
    private double amountMoney = 0;
    private double discount = 0;
    private ArrayList<Product> itemsInCart = new ArrayList<>();


    public Cashdesk() {
    }

    public void pay(Shoppingcart customer, double amountMoney) {
        this.amountMoney = amountMoney;
        this.itemsInCart = customer.itemsInCart();
        System.out.println(itemsInCart);
        originalPrice = checkTotalPrice();
        checkDiscount();
        System.out.println("original price is " + originalPrice + " Euro");
    }

    private double checkTotalPrice() {
        double price = 0;
        for (int i = 0; i <= itemsInCart.size() - 1; i++) {
            price += itemsInCart.get(i).getPrice();
        }
        return price;
    }

    private void checkDiscount() {
        double discount = 0;
        int robijnCounter = 0;
        int diaperCounter = 0;
        int quarkCounter = 0;
        for (int i = 0; i <= itemsInCart.size() - 1; i++) {
            if (itemsInCart.get(i).getName().equals("Robijn")) {
                robijnCounter += 1;
            } else if (itemsInCart.get(i).getName().equals("Diapers")) {
                diaperCounter += 1;
            } else if (itemsInCart.get(i).getName().equals("Quark")) {
                quarkCounter += 1;
            }
        }
        System.out.println(robijnCounter);
        System.out.println(diaperCounter);
        System.out.println(quarkCounter);
    }
}
