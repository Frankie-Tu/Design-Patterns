package com.frankie.creational.abstractfactory.drinks.alcoholicdrinks;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GenericWineTest {
    GenericWine myBear = new GenericWine();

    @Test
    public void describeTest(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        PrintStream old = System.out;
        // reassign output stream to printStream
        System.setOut(printStream);
        myBear.describe();
        System.out.flush();
        // change it back to System.out
        System.setOut(old);

        // new line since the actual command from method is println
        assertEquals("This is 500 ml Generic Wine, it contains [alcohol, water, grape]\n", baos.toString());
    }

}