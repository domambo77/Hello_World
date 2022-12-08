package Lesson16.SmartFridge;

import java.util.HashMap;

public class SmartFridge {
    //fields
    private HashMap<String, Integer> products = new HashMap<>();
    //constructor
    //methods
    public void putProducts(String product, int value){
        //if this product already in products

        if (products.containsKey(product)){
            products.put(product, value + products.get(product));
    }//if this product is not yet in products
        else{products.put(product, value);
        }
    }
    public void getProduct(String product, int value){
        // if this product present in fridge
        if (!products.containsKey(product)){
            System.out.println("Такого продукта у нас нет");
            return;
        }
        // if this product is not enough in our fridge
        if (products.get(product) < value){
            System.out.println("Продукта " + product + " недостаточно, выдал все, что есть " + products.get(product));
            products.remove(product);
        }
        //if this product is enough in our fridge
        if(products.get(product) == value){
            System.out.println("Продукта " + product + " достаточно");
            products.remove(product);
            return;
        }

    }
}
