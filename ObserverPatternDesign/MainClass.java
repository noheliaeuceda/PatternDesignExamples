/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author neuceda
 */
public class MainClass {
    public static void main(String[] args) {
        HeadHunter publisher = new HeadHunter();
        publisher.registerObserver(new JobSeeker("Nohelia"));
        publisher.registerObserver(new JobSeeker("Roman"));
        publisher.registerObserver(new JobSeeker("Crystel"));
        
        publisher.addJob("QA tester");
    }
}
