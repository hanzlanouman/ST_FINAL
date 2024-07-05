package org.example;

public class FlightCostEstimator {
    public double estimateCost(int distance, String serviceClass, boolean isPeakSeason) {
        if (distance < 1) {
            throw new IllegalArgumentException("Distance must be at least 1 km.");
        }

        double baseRate = 0.10;
        double cost = distance * baseRate;

        switch (serviceClass) {
            case "Economy":
                cost *= 1;
                break;
            case "Business":
                cost *= 1.5;
                break;
            case "First":
                cost *= 2;
                break;
            default:
                throw new IllegalArgumentException("Invalid service class");
        }

        if (isPeakSeason) {
            cost *= 1.2; // Apply peak season multiplier
        }

        return cost;
    }
}
