/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class SandwichMealBuilder implements MealBuilder{

    public SandwichMealBuilder() {
    }
    
    
    protected Meal meal = new Meal();
    
    @Override
    public void addSandwich(String sandwich){
       this.meal.sandwich =  sandwich;
    }
    @Override
    public void addSlides(String side){
        this.meal.sideOrder = side;
    }
    @Override
    public void addDrink(String drink){
        this.meal.drink = drink;
    }
    
    @Override
    public void addOffer(String offer){
        this.meal.offer = offer;
    }
    
    @Override
    public void setPrice(double price){
        this.meal.price = price;
    }
    
    @Override
    public Meal getMeal(){
        return this.meal;
    }

    @Override
    public String toString() {
        return "SandwichMealBuilder{" + "meal=" + meal + '}';
    }
    
    
    
    
}
