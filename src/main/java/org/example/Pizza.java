package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;
    private int numToppings;


    Pizza(String chain, String size, List<String> l) {
        this.chain = chain;
        setSize(size);
        toppings = new ArrayList<String>();
        for (String s : l) {
            addOneTopping(s);
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getSize() {
        return size;
    }

    public String getChain() {
        return chain;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void addOneTopping(String topping){
        toppings.add(topping);
        numToppings++;
    }

    public void eat() {
        System.out.println(getChain());
        System.out.println(getSize() + " pizza with " + getNumToppings() + " toppings:");
        displayToppings();
    }

    public void displayToppings(){
        if (toppings.isEmpty()) {
            return;
        }
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
        System.out.println();
    }
}
