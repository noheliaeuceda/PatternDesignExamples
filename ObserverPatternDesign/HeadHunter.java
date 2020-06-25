/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author neuceda
 */
public class HeadHunter implements Subject {

    protected ArrayList<Observer> userList;
    protected ArrayList<String> jobs;

    public HeadHunter() {
        this.userList = new ArrayList<Observer>();
        this.jobs = new ArrayList<String>();
    }

    @Override
    public void registerObserver(Observer user) {
        userList.add(user);
    }

    @Override
    public void removeObserver(Observer user) {
        userList.remove(user);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer u : userList) {
            u.update(this);
        }
    }

    public void addJob(String flight) {
        this.jobs.add(flight);
        notifyAllObservers();
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public String toString() {
        return jobs.toString();
    }

}
