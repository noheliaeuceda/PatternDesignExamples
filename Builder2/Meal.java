/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Meal {
    protected String sandwich;
    protected String sideOrder;
    protected String drink;
    protected String offer;
    protected double price;

   


    @Override
    public String toString() {
        return "Meal{" + "sandwich=" + sandwich + ", sideOrder=" + sideOrder + ", drink=" + drink + ", offer=" + offer + ", price=" + price + '}';
    }
    
}
