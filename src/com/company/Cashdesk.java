package com.company;

import java.time.LocalDate;
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
        double robijnPrice = 0;
        int diaperCounter = 0;
        double diaperPrice = 0;
        int quarkCounter = 0;
        double quarkPrice = 0;
        for (int i = 0; i <= itemsInCart.size() - 1; i++) {
            if (itemsInCart.get(i).getName().equals("Robijn")) {
                robijnCounter += 1;
                robijnPrice = itemsInCart.get(i).getPrice();
            } else if (itemsInCart.get(i).getName().equals("Diapers")) {
                diaperCounter += 1;
                diaperPrice = itemsInCart.get(i).getPrice();
            } else if (itemsInCart.get(i).getName().equals("Quark")) {
                quarkCounter += 1;
                quarkPrice = itemsInCart.get(i).getPrice();
            }
        }
        double discountRobijn = robijnDiscount(robijnCounter, robijnPrice);
        double discountDiapers = diaperDiscount(diaperCounter, diaperPrice);
        double discountQuark = quarkDiscount(quarkCounter, quarkPrice);
        System.out.println("discount from robijn = " + discountRobijn);
        System.out.println("discount from diapers = " + discountDiapers);
        System.out.println("discount from quark = " + discountQuark);
    }

    private double robijnDiscount(int robijnCounter, double robijnPrice){

        double originalRobijnPrice = robijnPrice*robijnCounter;
        double totalRobijnPrice = 0;

        if (robijnCounter%2 == 0){
            totalRobijnPrice = ((robijnPrice * robijnCounter)*0.69);
        } else if(robijnCounter != 0 && robijnCounter %2 != 0 && (robijnCounter-1) !=0 ){
            totalRobijnPrice = ((robijnPrice * (robijnCounter-1)*0.69));
            totalRobijnPrice += robijnPrice;
        }

        return originalRobijnPrice - totalRobijnPrice;
    }

    private double diaperDiscount(int diaperCounter, double diaperPrice) {

        double discountDiaper = 0;
        for(int i = 0; i<= diaperCounter; i++){
            if (i%4 ==0 && i !=0){
                System.out.println((i%4 ==0));
                discountDiaper += diaperPrice;
            }
        }

        return discountDiaper;
    }

    private double quarkDiscount(int quarkCounter, double quarkPrice) {
        LocalDate now = LocalDate.now();
        double discountQuark = 0;
        if (now.getDayOfWeek().toString().equals("WEDNESDAY")){
            discountQuark =(quarkCounter * quarkPrice)/2;
        }

        return discountQuark;
    }
}
