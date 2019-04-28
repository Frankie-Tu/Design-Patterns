package com.frankie.creational.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTest {

    String myCpu = "i9";
    String myRam = "16GB";
    String myCooling = "Water Cooling";
    String myHardDrive = "1TB";

    Computer.Builder myBuild = new Computer.Builder().cpu(myCpu).ram(myRam).cooling(myCooling).hardDrive(myHardDrive);
    Computer myComputer = myBuild.build();

    @Test
    public void testGetCpu() {
        assertEquals(myCpu,myComputer.getCpu());
    }

    @Test
    public void testGetDiscreteGpu() {
        assertNull(myComputer.getDiscreteGpu());
    }

    @Test
    public void testGetRam() {
        assertEquals(myRam, myComputer.getRam());
    }

    @Test
    public void testGetMotherboard() {
        assertEquals("default motherboard", myComputer.getMotherboard());
    }

    @Test
    public void testGetCooling() {
        assertEquals(myCooling, myComputer.getCooling());
    }

    @Test
    public void testGetPowerSupply() {
        assertEquals("default power supply", myComputer.getPowerSupply());

    }

    @Test
    public void testGetHardDrive() {
        assertEquals(myHardDrive, myComputer.getHardDrive());
    }

    @Test
    public void testGetComputerCase() {
        assertEquals("default case", myComputer.getComputerCase());
    }
}