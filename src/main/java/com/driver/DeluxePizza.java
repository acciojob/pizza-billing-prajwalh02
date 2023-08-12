package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {    //constructor
        super(isVeg);
        // your code goes here
        this.addExtraCheese();          //in deluxe pizza only this two things is by default added
        this.addExtraToppings();
    }
}
