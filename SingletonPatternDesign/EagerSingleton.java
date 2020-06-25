/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();
    // private constructor

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
