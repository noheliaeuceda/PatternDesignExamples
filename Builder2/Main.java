/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Main {
    public static void main(String[] args) {
        MealDirector md = new MealDirector();
        SandwichMealBuilder smb = new SandwichMealBuilder();
        md.makeMeal(smb);
        System.out.println(smb.getMeal().toString());;
        
    }
    
}
