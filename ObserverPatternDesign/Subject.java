/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public interface Subject {

    public void registerObserver(Observer user);

    public void removeObserver(Observer user);

    public void notifyAllObservers();

}
