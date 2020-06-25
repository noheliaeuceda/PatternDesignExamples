/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class principal {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car c = (Car) cf.carConstructor(CarType.LUXURY);
        System.out.println(c.getModel());
        
    }
    
}
