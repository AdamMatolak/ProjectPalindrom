package sk.kosickaakademia.matolak.math.planimetria;

public class Main {

    public static void main(String[] args) {

        Point bod1 = new Point(-5,6);
        int quadrant = bod1.getQuadrant();
        bod1.print();
        System.out.println("Quadrant of point is: " + quadrant);
        double distanceFromS = bod1.getDistanceFromS();
        System.out.println("Distance of the point from the center is: " + distanceFromS);

    }

}
