package com.FinancialForecastingExample;

public class Forecaster {
    public static double predictRecursive(double value, double rate, int years) {
        if (years == 0) return value;
        return predictRecursive(value * (1 + rate), rate, years - 1);
    }

    public static double predictMemo(double value, double rate, int years, double[] memo) {
        if (years == 0) return value;
        if (memo[years] != 0) return memo[years];
        memo[years] = predictMemo(value, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
