package org.example;

public class Main {
    public static void main(String[] args) {
       FlightCostEstimator estimator = new FlightCostEstimator();
            double cost = estimator.estimateCost(10000, "Business", false);
            System.out.println("Estimated cost: " + cost);
    }
}