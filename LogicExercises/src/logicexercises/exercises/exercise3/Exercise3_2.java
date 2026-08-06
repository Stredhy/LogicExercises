package logicexercises.exercises.exercise3;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3_2 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num = 0; 
        boolean flag = true;
        
        System.out.print("Give me a number: ");
        if (cs.hasNextInt()) {
            num = cs.nextInt();
            
            if (num <= 1) {
                flag = false;
            }else{
                for (int i = 2; (i * i) <= num; i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            
            System.out.println("The number " + num + 
                        ((flag)? " is prime" : " is not prime"));
            
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
    }
}
