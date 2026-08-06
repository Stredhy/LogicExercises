package logicexercises.exercises.exercise3;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author stredhy
 */
public class Exercise3_7 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num = 0;
        int minor = 0, major = 0;
        boolean flag = true;
        
        ArrayList<Integer> values = new ArrayList<Integer>();
        
        while(flag){
            System.out.print("Give me a number: ");
            if (cs.hasNextInt()) {
                num = cs.nextInt();
                
                if (!values.isEmpty()) {
                    if(num < minor && num != 0){
                        minor = num;
                    }

                    if (num > major) {
                        major = num;
                    }

                }else{
                    minor = num;
                    major = num;
                }
            
                if (num == 0) {
                    flag = false;
                }
                
            }else{
                System.out.println("Invalid value");
                cs.next();
            }
             
            if (num != 0) {
                if (!values.contains(num)) {
                    values.add(num);
                }
                System.out.println(values.toString());
            }
        }
        System.out.println("Minor: " + minor);
        System.out.println("Major: " + major);
    }
}
