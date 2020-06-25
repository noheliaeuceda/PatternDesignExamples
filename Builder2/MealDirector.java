/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class MealDirector {

    public MealDirector() {
    }
    
    public void makeMeal(MealBuilder mealBuilder){
        mealBuilder.addSandwich("Ham Sandwich");
        mealBuilder.addSlides("French Fries");
        mealBuilder.addDrink("Sprite");
        mealBuilder.addOffer("Econocombo");
        mealBuilder.setPrice(115.99);
    }
    
}
