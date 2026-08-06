package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_3 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int original = 0, reverse = 0;
        System.out.print("Give me a 4 digits number: ");
        if (cs.hasNextInt()) {
            original = cs.nextInt();
            String temp = new StringBuilder(Integer.toString(original))
                    .reverse().toString();
            if (temp.length() != 4) {
                System.out.println("Needs to be 4 digits");
                System.exit(0);
            }
            reverse = Integer.parseInt(temp);
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println("Original: " + original);
        System.out.println("Reverse: " + reverse);
        
        System.out.println(original == reverse? "They are the same" :
                                    "They are not the same");
    }
}
