package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_7 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int a = 0, b = 0, x = 0;
        
        System.out.print("Give me X value: ");
        if (cs.hasNextInt()) {
            a = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me Y value: ");
        if (cs.hasNextInt()) {
            b = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me W value: ");
        if (cs.hasNextInt()) {
          x = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        if (a <= x && x <= b) {
            System.out.println("This is within the interval");
        }else{
            System.out.println("This is not within the interval");
        }
        
    }
}
