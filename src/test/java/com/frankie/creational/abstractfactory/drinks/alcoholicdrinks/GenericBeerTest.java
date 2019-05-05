package com.frankie.creational.abstractfactory.drinks.alcoholicdrinks;

import com.frankie.creational.abstractfactory.drinks.Water;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GenericBeerTest {
    GenericBeer myBeer = new GenericBeer();

    @Test
    public void describeTest (){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        PrintStream old = System.out;
        // reassign output stream to printStream
        System.setOut(printStream);
        myBeer.describe();
        System.out.flush();
        // change it back to System.out
        System.setOut(old);

        // new line since the actual command from method is println
        assertEquals("This is 300 ml Generic Beer, it contains [alcohol, water]\n", baos.toString());
    }
}