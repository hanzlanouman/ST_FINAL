import static org.junit.Assert.*;

import org.example.FlightCostEstimator;
import org.junit.Test;

public class FlightCostEstimatorTest {
    FlightCostEstimator estimator = new FlightCostEstimator();

    // Test Case 1: Minimum Valid Distance
    @Test
    public void testMinimumDistanceEconomy() {
        assertEquals(0.10, estimator.estimateCost(1, "Economy", false), 0.001);
    }

    // Test Case 2: High Distance During Peak Season
    @Test
    public void testHighDistanceEconomyPeak() {
        assertEquals(1440.0, estimator.estimateCost(12000, "Economy", true), 0.001);
    }

    // Test Case 3: Zero Distance
    @Test(expected = IllegalArgumentException.class)
    public void testZeroDistance() {
        estimator.estimateCost(0, "Economy", false);
    }

    // Test Case 4: Invalid Service Class
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidClass() {
        estimator.estimateCost(5000, "Ultra", false);
    }

    // Test Case 5: First Class High Distance Non-Peak
    @Test
    public void testFirstClassHighDistanceNonPeak() {
        assertEquals(2400.0, estimator.estimateCost(12000, "First", false), 0.001);
    }
}
