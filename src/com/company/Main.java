package com.company;

public class Main {

    public static void main(String[] args) {
	Shoppingcart customer1 = new Shoppingcart();
	customer1.addItemToCart("Robijn");
	customer1.addItemToCart("Brinta");
	customer1.addItemToCart("Kwark");
	customer1.showItemsInCart();
//	customer1.deleteItem("Robijn");

	Cashdesk bill = new Cashdesk();
	bill.pay(customer1);

    }
}
