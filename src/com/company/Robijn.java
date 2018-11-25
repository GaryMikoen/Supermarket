package com.company;

public class Robijn extends Cleaningproduct {
    private double price = 3.00;
    private String name = "Robijn";
    private int amount = 0;

    public Robijn() {
        super();
        amount ++;
    }

    @Override
    public void discount() {
        super.discount();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
