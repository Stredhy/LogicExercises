package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_4 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        double divisor = 0, dividend = 0, quotient, remainder;
        System.out.print("Give me a divisor: ");
        if(cs.hasNextDouble()){
            divisor = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me a dividend: ");
        if(cs.hasNextDouble()){
            dividend = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        quotient = divisor / dividend;
        remainder = divisor % dividend;
        
        System.out.println(divisor + " divided by " + dividend + " give a "
                            + "quotient of " + quotient
                            + " and a remainder of " + remainder);
    }
}
