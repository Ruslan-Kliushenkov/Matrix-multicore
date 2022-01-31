package com.core.test;

public class MultCore extends Thread {

    @Override
    public void run() {
        System.out.println("Thread created");
        MultiBuilder.fillMatrix();
    }
}

