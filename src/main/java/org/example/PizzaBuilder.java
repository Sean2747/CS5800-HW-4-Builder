package org.example;
import java.util.*;

public class PizzaBuilder {
    private String pizzaChain;
    private String size;
    private List<String> listOfToppings;

    public PizzaBuilder(String pizzaChain) {
        this.pizzaChain = pizzaChain;
        listOfToppings = new ArrayList<>();
    }

    public PizzaBuilder chooseSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addPepperoni(){
        listOfToppings.add("pepperoni");
        return this;
    }

    public PizzaBuilder addSausage(){
        listOfToppings.add("sausage");
        return this;
    }

    public PizzaBuilder addMushrooms(){
        listOfToppings.add("mushrooms");
        return this;
    }

    public PizzaBuilder addBacon(){
        listOfToppings.add("bacon");
        return this;
    }

    public PizzaBuilder addOnions(){
        listOfToppings.add("onions");
        return this;
    }

    public PizzaBuilder addExtraCheese(){
        listOfToppings.add("extra-cheese");
        return this;
    }

    public PizzaBuilder addPeppers(){
        listOfToppings.add("peppers");
        return this;
    }

    public PizzaBuilder addChicken(){
        listOfToppings.add("chicken");
        return this;
    }

    public PizzaBuilder addOlives(){
        listOfToppings.add("olives");
        return this;
    }

    public PizzaBuilder addSpinach(){
        listOfToppings.add("spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil(){
        listOfToppings.add("tomato and basil");
        return this;
    }

    public PizzaBuilder addBeef(){
        listOfToppings.add("beef");
        return this;
    }

    public PizzaBuilder addHam(){
        listOfToppings.add("ham");
        return this;
    }

    public PizzaBuilder addPesto(){
        listOfToppings.add("pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork(){
        listOfToppings.add("spicy pork");
        return this;
    }

    public PizzaBuilder addHamAndPineapple(){

        listOfToppings.add("ham and pineapple");
        return this;
    }

    public Pizza createPizza() {
        Pizza resultPizza = new Pizza (pizzaChain, size, listOfToppings);
        listOfToppings.clear();
        return resultPizza;
    }
}
