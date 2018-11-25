package com.company;

import java.util.ArrayList;

public class Cashdesk {
    private double originalPrice = 0;
    private double amountMoney = 0;
    private ArrayList<Product> itemsInCart = new ArrayList<>();


    public Cashdesk() {
    }

    public void pay(Shoppingcart customer, double amountMoney){
        this.amountMoney = amountMoney;
        this.itemsInCart = customer.itemsInCart();
        System.out.println(itemsInCart);
        originalPrice = checkTotalPrice();
        System.out.println("original price is " + originalPrice + " Euro");
    }

    private double checkTotalPrice(){
        double price = 0;
        for(int i = 0; i<=itemsInCart.size() -1; i++){
            price += itemsInCart.get(i).getPrice();
        }
        return price;
    }




}
