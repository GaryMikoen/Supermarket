package com.company;

import java.util.ArrayList;

public class Shoppingcart {

    //items are stored in this array
    private ArrayList<Product> itemsInCart = new ArrayList<>();

    public Shoppingcart() {
    }

    //items are stored to the cart through this method
    public void addItemToCart(Product item){
        itemsInCart.add(item);
    }

    //Items are deleted by getting the string name of a product and then deleting that item from the arraylist
    public void deleteItem(String item){
        for (int i = 0 ; i<= itemsInCart.size()-1; i++){
            if (itemsInCart.get(i).getName().equals(item) ){
                itemsInCart.remove(i);
                break;
            }
        }
    }

    //shows names of items in the cart
    public void showItemsInCart(){
        for (Product item:itemsInCart){
            System.out.println(item.getName());
        }
    }

    //show prices of items in the cart
    public void showPricesInCart(){
        for (Product item:itemsInCart){
            System.out.println(item.getPrice());
        }
    }

    //shows arraylist and returns the objects
    public ArrayList<Product> itemsInCart(){
        return itemsInCart;
    }

}
