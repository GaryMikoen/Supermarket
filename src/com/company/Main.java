package com.company;

public class Main {

    public static void main(String[] args) {
    	/*
    	Built with the idea that a customer does online grocery shopping so he has a shoppingcart.
    	All items are objects that stores names and prices, wanted to do a bit more with inheritance
    	 */
	Shoppingcart customer1 = new Shoppingcart();
	customer1.addItemToCart(new Robijn());
	customer1.addItemToCart(new Brinta());
	customer1.addItemToCart(new Chinesevegetables());
	customer1.addItemToCart(new Quark());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Diapers());
	customer1.addItemToCart(new Brinta());
	customer1.addItemToCart(new Robijn());
	customer1.addItemToCart(new Robijn());
	customer1.addItemToCart(new Robijn());
	customer1.addItemToCart(new Robijn());
	customer1.addItemToCart(new Robijn());

	/*
	Showcase of deleting an item that searches for the name of the object in string type.
	 */
	customer1.deleteItem("Robijn");
	System.out.println("items in cart");
	customer1.showItemsInCart();
	System.out.println();

	/*
	Checkout of shoppingcart where the customer with its items in an arraylist pays with an amount of money
	 */
	Cashdesk bill = new Cashdesk();
	bill.pay(customer1, 200);


    }
}
