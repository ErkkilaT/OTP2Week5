package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @org.junit.jupiter.api.Test
    void askInt() {
        ByteArrayInputStream in = new ByteArrayInputStream("6\n".getBytes());
        System.setIn(in);
        assertEquals(6, App.askInt());
    }

    @org.junit.jupiter.api.Test
    void runLoop() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        App.runLoop(3);

        String output = out.toString();

        String expected ="i = 1\n"
        + "i = 2\n"
         +"i = 3\n";
        assertEquals(expected.replace("\r",""), output.replace("\r",""));
    }
}