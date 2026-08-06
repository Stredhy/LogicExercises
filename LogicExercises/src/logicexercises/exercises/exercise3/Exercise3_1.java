package logicexercises.exercises.exercise3;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3_1 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num = 1;
        int i = 0;
        System.out.print("Give me a positive number: ");
        if (cs.hasNextInt()) {
            num = cs.nextInt();
            if (num < 1) {
                System.out.println("Invaid value");
                System.exit(0);
            }
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        while(i < num){
            if(i % 2 != 0){
                System.out.println(i);
            }
                        
            i++;
        }
        
        System.out.println("Your number: " + num);
    }
}
