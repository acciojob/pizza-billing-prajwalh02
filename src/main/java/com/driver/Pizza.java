package com.driver;

public class Pizza {

    private int price;           //total price
    private Boolean isVeg;        //tell whether its veg or non-veg
    private String bill;          //hold the bill

    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int paperBagPrice;

    // making flag
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isTakeawayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){        //constructor
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true) {        //for veg pizza
            this.basePrice  = 300;
            this.extraToppingPrice = 70;
        }
        else {                      //for non-veg pizza
            this.basePrice = 400;
            this.extraToppingPrice = 120;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;

        this.price = this.basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isExtraCheeseAdded == false) {
            this.price += this.extraCheesePrice;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isExtraToppingAdded == false) {
            this.price += this.extraToppingPrice;
            this.isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isTakeawayAdded == false) {
            this.price += this.paperBagPrice;
            this.isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here

        if(this.isBillGenerated == false) {
            this.bill = "Base Price Of The Pizza: " +this.basePrice + "\n";

            if(this.isExtraCheeseAdded == true) {
                this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }

            if(this.isExtraToppingAdded == true) {
                this.bill += "Extra Toppings Added: " + this.extraToppingPrice+"\n";
            }

            if(this.isTakeawayAdded == true) {
                this.bill += "Paperbag Added: " +this.paperBagPrice+ "\n";
            }

            this.bill += "Total Price: " +this.price;
            this.isBillGenerated = true;
        }

        return this.bill;
    }
}
