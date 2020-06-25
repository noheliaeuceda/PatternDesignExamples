/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Car {
    CarType carro;

    public Car(CarType carro) {
        this.carro = carro;
    }
    
    public Car() {
    }

    public CarType getModel() {
        return carro;
    }

    public void setModel(CarType carro) {
        this.carro = carro;
    }
    
    
}
