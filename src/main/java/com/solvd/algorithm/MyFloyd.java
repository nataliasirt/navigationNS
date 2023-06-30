package com.solvd.algorithm;

public class MyFloyd {
    final static int INF = 9999, nV = 4;

    // Direction Routes
    private double[][] directions;

    // Distance Routes
    private double[][] distances;

    public MyFloyd(int size) {
        directions = new double[size][size];
        distances = new double[size][size];
    }

    public double[][] getDistances() {
        return distances;
    }

    public void setDistances(double[][] distances) {
        this.distances = distances;
    }

    public double[][] getDirections() {
        return directions;
    }

    public void setDirections(double[][] directions) {
        this.directions = directions;
    }

}
