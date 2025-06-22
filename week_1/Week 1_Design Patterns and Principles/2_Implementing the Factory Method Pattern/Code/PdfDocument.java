package com.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF document opened");
    }
}
