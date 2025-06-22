package com.FinancialForecastingExample;

public class TestForecast {
    public static void main(String[] args) {
        double initial = 1000;
        double rate = 0.1;
        int years = 5;

        double r1 = Forecaster.predictRecursive(initial, rate, years);
        System.out.println("Recursive: " + r1);

        double[] memo = new double[years + 1];
        double r2 = Forecaster.predictMemo(initial, rate, years, memo);
        System.out.println("Memoized: " + r2);
    }
}
