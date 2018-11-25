package com.company;

public class Main {

    public static void main(String[] args) {
	Shoppingcart customer1 = new Shoppingcart();
	customer1.addItemToCart();
	customer1.showItemsInCart();
	customer1.deleteItem("Robijn");
    }
}
