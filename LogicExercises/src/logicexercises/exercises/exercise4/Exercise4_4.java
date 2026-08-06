package logicexercises.exercises.exercise4;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise4_4 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int n = 0, k = 0;
        System.out.print("Which number do you want to pull out?: ");
        if (cs.hasNextInt()) {
            n = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.print("Until which ordinal number?: ");
        if(cs.hasNextInt()) {
            k = cs.nextInt();
            String temp = Integer.toString(n);
            if(temp.length() < k){
                System.out.println("N nummber is not so big");
                System.exit(0);
            }
        }
        
        System.out.println("The ordinal number is: " + extractDigits(n, k));
    }
    
    public int extractDigits(int n, int k){
        return Integer.parseInt(Integer.toString(n).substring(0, k));
    }
}
