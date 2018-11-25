package com.company;

import java.util.ArrayList;

public class Shoppingcart {

    private ArrayList<Product> itemsInCart = new ArrayList<>();

    public Shoppingcart() {
    }

    public void addItemToCart(Product item){
        itemsInCart.add(item);
    }

    public void deleteItem(String item){
        for (int i = 0 ; i<= itemsInCart.size()-1; i++){
            if (itemsInCart.get(i).getName().equals(item) ){
                itemsInCart.remove(i);
                break;
            }
        }
    }

    public void showItemsInCart(){
        for (Product item:itemsInCart){
            System.out.println(item.getName());
        }
    }

    public void showPricesInCart(){
        for (Product item:itemsInCart){
            System.out.println(item.getPrice());
        }
    }

    public ArrayList<Product> itemsInCart(){
        return itemsInCart;
    }

}
