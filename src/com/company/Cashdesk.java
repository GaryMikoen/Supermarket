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


    //bit of a mess but prices with their discounts are checked here
    public void pay(Shoppingcart customer, double amountMoney) {
        this.amountMoney = amountMoney;
        this.itemsInCart = customer.itemsInCart();

        //shows items in the cart that customer wants to pay
        System.out.println("items to pay");
        for (int i = 0; i<= itemsInCart.size()-1; i++){
            System.out.println(itemsInCart.get(i).getName());
        }

        System.out.println("prices");

        //original total price is
        originalPrice = checkTotalPrice();
        System.out.println("original price is " + originalPrice + " Euro");

        //discount is being calculated here, this changes the discount instance
        checkDiscount();

        //calculate the new price by substracting the discount from the original price
        double newprice = (originalPrice - discount);
        System.out.println("New price = " + newprice);

        //shows what the customer gets back in terms of money.
        System.out.println("Money change = " + (amountMoney -newprice));
    }

    //Calculates original total price by going over the arraylist
    private double checkTotalPrice() {
        double price = 0;
        for (int i = 0; i <= itemsInCart.size() - 1; i++) {
            price += itemsInCart.get(i).getPrice();
        }
        return price;
    }

    //calculates the total discount
    private void checkDiscount() {

        /* discount is being checked by checking the amount of robijn, diapers and quark being bought and the current
        price, bit ugly though
        */
        double discount = 0;
        int robijnCounter = 0;
        double robijnPrice = 0;
        int diaperCounter = 0;
        double diaperPrice = 0;
        int quarkCounter = 0;
        double quarkPrice = 0;

        /*
        For loop to fill to local variables
         */
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

        /*
        local variables are being used here to fill the discount methods
         */
        double discountRobijn = robijnDiscount(robijnCounter, robijnPrice);
        double discountDiapers = diaperDiscount(diaperCounter, diaperPrice);
        double discountQuark = quarkDiscount(quarkCounter, quarkPrice);
        this.discount = discountRobijn + discountDiapers + discountQuark;

        /*
        prints the discount immediately, should make a print statement though
         */
        System.out.println("discount from robijn = " + discountRobijn);
        System.out.println("discount from diapers = " + discountDiapers);
        System.out.println("discount from quark = " + discountQuark);
        System.out.println("total discount = " + discount);

    }

    //Method that calculats the robijn discount
    private double robijnDiscount(int robijnCounter, double robijnPrice){

        double originalRobijnPrice = robijnPrice*robijnCounter;
        double totalRobijnPrice = 0;

        // every 2 items has discount, so we check if its even and then add the discount
        if (robijnCounter%2 == 0){
            totalRobijnPrice = ((robijnPrice * robijnCounter)*0.69);
        } else if(robijnCounter != 0 && robijnCounter %2 != 0 && (robijnCounter-1) !=0 ){
            totalRobijnPrice = ((robijnPrice * (robijnCounter-1)*0.69));
            totalRobijnPrice += robijnPrice;
        }

        return originalRobijnPrice - totalRobijnPrice;
    }

    //method that calculates the discount for diapers
    private double diaperDiscount(int diaperCounter, double diaperPrice) {

        //for loop to calculate the discount, if the number modulo 4 is 0, we get a discount of 1 free diaper
        double discountDiaper = 0;
        for(int i = 0; i<= diaperCounter; i++){
            if (i%4 ==0 && i !=0){
                discountDiaper += diaperPrice;
            }
        }

        return discountDiaper;
    }

    //method to calcualte quark discount
    private double quarkDiscount(int quarkCounter, double quarkPrice) {
        // if date is wednesday, the price of every quark is slashed in half.
        LocalDate now = LocalDate.now();
        double discountQuark = 0;

        if (now.getDayOfWeek().toString().equals("WEDNESDAY")){
            discountQuark =(quarkCounter * quarkPrice)/2;
        }

        return discountQuark;
    }
}
