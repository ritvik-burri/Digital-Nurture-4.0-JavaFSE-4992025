package com.SingletonPatternExample;

public class TestLogger {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("First message");
        l2.log("Second message");
        System.out.println(l1 == l2);
    }
}
