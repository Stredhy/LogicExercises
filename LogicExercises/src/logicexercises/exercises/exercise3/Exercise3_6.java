package logicexercises.exercises.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3_6 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num = 0; 
        int counter = 0;
        boolean flag = true;
        boolean witness = true;
        ArrayList<Integer> values = new ArrayList<Integer>();
        
        while(flag){
            System.out.print("Give me a number: ");
            if (cs.hasNextInt()) {
                num = cs.nextInt();
                values.add(num);
                
                System.out.println(values.toString());
                
                for (int i = 2; (i * i) <= num; i++) {
                    if (num % i == 0) {
                        witness = false;
                        break;
                    }
                }
                
                if (witness) {
                    counter++;
                }
                
                if(num == 0){
                    flag = false;
                }
            }else{
                System.out.println("Invalid value");
                System.exit(0);
            }
        }
        System.out.println("Total prime: " + counter);
    }
}
