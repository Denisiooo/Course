package Lesson5;

public class TaskGeometry {
    public static final double Pi = 3.14;

    public double squareCircle(double radius){
        double Square = Pi*radius*radius;
        return Square;
    }

    public static double lengthCircle(double radius){
        double Length = 2*Pi*radius;
        return Length;
    }

    public void Info(double radius){
        System.out.println("Radius: " + radius + " , Square of circle: " + squareCircle(radius) + " , Length of circle: " + lengthCircle(radius));
    }
}
