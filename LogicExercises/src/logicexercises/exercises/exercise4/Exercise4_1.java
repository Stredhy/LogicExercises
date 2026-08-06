package logicexercises.exercises.exercise4;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise4_1 {
    final double PI = Math.PI;
    
    public void execute(){
        Scanner cs = new Scanner(System.in);
        double circleRad = 0, height = 0, cylinderRad = 0;
        
        System.out.print("Give me a circle radius: ");
        if (cs.hasNextDouble()) {
            circleRad = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.print("Give me a cylinder radius: ");
        if (cs.hasNextDouble()) {
            cylinderRad = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println("Now...");
        System.out.print("Give me a height for the cylinder: ");
        if (cs.hasNextDouble()) {
            height = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println("Circle area: " + getCircle(circleRad));
        System.out.println("Volume of a cylinder: " + (getCircle(cylinderRad) * height));
    }
    
    public double getCircle(double radius){
        return PI * (radius * radius);
    }
}
