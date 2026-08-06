package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_9 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        double xPositive = 0, xNegative = 0;
        double part1;
        System.out.print("Give me 'A' value: ");
        if (cs.hasNextDouble()) {
            a = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me 'B' value: ");
        if (cs.hasNextDouble()) {
            b = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me 'C' value: ");
        if (cs.hasNextDouble()) {
            c = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        part1 = (b * b) - (4*a*c);
        xPositive = (-b + Math.sqrt(part1))/(2*a);
        xNegative = (-b - Math.sqrt(part1))/(2*a);
        
        System.out.println("X positive: " + xPositive);
        System.out.println("X negative: " + xNegative);
        
    }
}
