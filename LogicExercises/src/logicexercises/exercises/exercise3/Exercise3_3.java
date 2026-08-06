package logicexercises.exercises.exercise3;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3_3 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int iterations = 0;
        
        System.out.print("How many iterations you want to do? ");
        if (cs.hasNextInt()) {
            iterations = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        double divisor = 1;
        double temp = 0;
        
        for (int i = 0; i < iterations; i++) {
            if(!(divisor < 0)){
                divisor = -(divisor + 2);
            }else{
                divisor = -divisor + 2;
            }
            temp += (4/divisor);
            
            System.out.println(temp + " / " + divisor);
        }
        System.out.println(4 + temp);
    }
}
