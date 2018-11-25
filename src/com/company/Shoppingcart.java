package com.company;

import java.util.ArrayList;

public class Shoppingcart {

    private ArrayList<String> itemsInCart = new ArrayList<>();


    public Shoppingcart() {
    }

    public void addItemToCart(String item){
        itemsInCart.add(item);
    }

    public void deleteItem(String item){
        itemsInCart.remove(item);
    }

    public void showItemsInCart(){
        for (String item:itemsInCart){
            System.out.println(item);
        }
    }

    public ArrayList<String> itemsInCart(){
        return itemsInCart;
    }

}
