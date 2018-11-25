package com.company;

public abstract class Cleaningproduct extends Product {
    private int amount = 0;
    private float price;

    public Cleaningproduct() {
        super();
    }

    public void discount(){
        if(amount == 2){
            price = price/2;
        }
    }



}
