package com.jetbrains.teamcity.buildlog.example;

import org.junit.Assert;
import org.junit.Test;


public class SimpleTest {

    @Test
    public void willPass(){
        final Simple simple = new Simple();
        printAdditonalOutput();
        Assert.assertEquals("5", simple.printNumber(5));
    }

    @Test
    public void willFail(){
        final Simple simple = new Simple();
        printAdditonalOutput();
        Assert.assertEquals("4", simple.printNumber(5));
    }

    @Test
    public void willThrowExceptionInTest(){
        printAdditonalOutput();
        throw new RuntimeException("This test throws unpredictable exception after some long output");
    }

    private void printAdditonalOutput() {
        System.out.println("Let's assume we have a lot of some output here");
        System.out.println("And even more");
        for (int i=0; i < 10; i++) {
            System.out.println("and more and more...");
        }
    }

}
