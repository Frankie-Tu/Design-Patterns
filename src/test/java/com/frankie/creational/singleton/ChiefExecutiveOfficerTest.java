package com.frankie.creational.singleton;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChiefExecutiveOfficerTest implements Runnable {

    // basic test
    @Test
    public void ifOnlyInstance(){
        ChiefExecutiveOfficer myInstance1 = ChiefExecutiveOfficer.getInstance();
        ChiefExecutiveOfficer myInstance2 = ChiefExecutiveOfficer.getInstance();
        System.out.println(myInstance1);
        System.out.println(myInstance2);
        assertEquals(myInstance1,myInstance2);
    }

    @Test
    @Override
    public void run() {
        // multithreading test
        Runnable Instance1 = new MultiThreadRun();
        Runnable Instance2 = new MultiThreadRun();

        new Thread(Instance1).start();
        new Thread(Instance2).start();
    }
}