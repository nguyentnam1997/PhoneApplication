package entities;

import java.util.Map;

public class SalesReport {
    private Map<Integer, Double> revenueMap;

    public SalesReport(Map<Integer, Double> revenueMap) {
        this.revenueMap = revenueMap;
    }

    public Map<Integer, Double> getRevenueMap() {
        return revenueMap;
    }

    public void setRevenueMap(Map<Integer, Double> revenueMap) {
        this.revenueMap = revenueMap;
    }
}
