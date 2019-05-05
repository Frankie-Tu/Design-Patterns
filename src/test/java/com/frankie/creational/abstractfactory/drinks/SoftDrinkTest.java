package com.frankie.creational.abstractfactory.drinks;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SoftDrinkTest {

    @Test
    public void describe() {
        SoftDrink mysoftDrink = new SoftDrink();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        PrintStream old = System.out;
        // reassign output stream to printStream
        System.setOut(printStream);
        mysoftDrink.describe();
        System.out.flush();
        // change it back to System.out
        System.setOut(old);

        // new line since the actual command from method is println
        assertEquals("This is 355 ml Generic Soft Drink and it contains [carbonated water, sugar(sweeteners)]\n", baos.toString());
    }
}