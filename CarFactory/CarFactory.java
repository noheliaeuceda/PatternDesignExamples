/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class CarFactory {

    public CarFactory() {
    }
    

    public Car carConstructor(CarType carType) {
        if(carType == CarType.LUXURY){
            return new LuxuryCar(CarType.LUXURY);
        }else if(carType == CarType.SMALL){
            return new SmallCar(CarType.SMALL);
        }else{
            return new SedanCar(CarType.SEDAN);
        }
    }
    
}
