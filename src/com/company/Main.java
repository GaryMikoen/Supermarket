package com.company;

public class Main {

    public static void main(String[] args) {
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



	customer1.deleteItem("Robijn");
	System.out.println("items in cart");
	customer1.showItemsInCart();
	System.out.println();

	Cashdesk bill = new Cashdesk();
	bill.pay(customer1, 100);


    }
}
