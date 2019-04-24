package com.frankie.creational.singleton;

public class MultiThreadRun implements Runnable {

    @Override
    public void run() {
        ChiefExecutiveOfficer myCEO = ChiefExecutiveOfficer.getInstance();
        System.out.println(System.identityHashCode(myCEO));
    }
}
