package com.frankie.creational.abstractfactory.drinks;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class WaterTest {

    @Test
    public void describe() {
        Water myWater = new Water();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        PrintStream old = System.out;
        // reassign output stream to printStream
        System.setOut(printStream);
        myWater.describe();
        System.out.flush();
        // change it back to System.out
        System.setOut(old);

        // new line since the actual command from method is println
        assertEquals("This is just 400 ml water\n", baos.toString());
    }
}