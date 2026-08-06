package logicexercises.exercises.exercise3;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3_5 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num;
        int addition = 0;
        
        System.out.print("Give me a number: ");
        if (cs.hasNextInt()) {
            num = cs.nextInt();
           
            for (int i = 1; i <= num; i++) {
                int multiplication = 1;
                for (int j = 1; j <= i; j++) {
                    multiplication *= j * j; 
                    System.out.println("Multiplication: " + multiplication);
                }
                addition += multiplication;
                System.out.println("Addition: " + addition);
            }

        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
            
    }
}
