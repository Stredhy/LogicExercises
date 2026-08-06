package logicexercises.exercises.compEx;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Give me a number: ");
        if (cs.hasNextInt()) {
            num = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println((num % 2 == 0)? "Is pair" : "Is unpair");
    }
}
