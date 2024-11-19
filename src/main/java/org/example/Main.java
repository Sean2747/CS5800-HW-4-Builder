package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder PizzaHut = new PizzaBuilder("Pizza Hut");
        Pizza pizza1 = PizzaHut.chooseSize("Small").addBacon().addMushrooms().addOlives().createPizza();
        Pizza pizza2 = PizzaHut.chooseSize("Medium").addHam().addChicken().addExtraCheese().addOnions().addPepperoni().addPeppers().createPizza();
        Pizza pizza3 = PizzaHut.chooseSize("Large").addHamAndPineapple().addBacon().addChicken().addOlives().addBeef().addExtraCheese().addMushrooms().addSpinach().addTomatoAndBasil().createPizza();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        PizzaBuilder LilCaesars = new PizzaBuilder("Little Caesars");
        PizzaBuilder Dominos = new PizzaBuilder("Dominos");
        Pizza hut1 = PizzaHut.chooseSize("Large").addHamAndPineapple().addBacon().addChicken().createPizza();
        Pizza hut2 = PizzaHut.chooseSize("Small").addBacon().addMushrooms().createPizza();
        Pizza little1 = LilCaesars.chooseSize("Medium").addHamAndPineapple().addBacon().addChicken().addOlives().addBeef().addMushrooms().addSpinach().addTomatoAndBasil().createPizza();
        Pizza little2 = LilCaesars.chooseSize("Small").addHam().addChicken().addExtraCheese().addOnions().addPepperoni().addPeppers().createPizza();
        Pizza domino1 = Dominos.chooseSize("Small").addChicken().createPizza();
        Pizza domino2 = Dominos.chooseSize("Large").addHamAndPineapple().addBacon().addOlives().createPizza();

        hut1.eat();
        hut2.eat();
        little1.eat();
        little2.eat();
        domino1.eat();
        domino2.eat();
    }
}