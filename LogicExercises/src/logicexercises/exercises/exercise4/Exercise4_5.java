package logicexercises.exercises.exercise4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise4_5 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();
        int num = 0;
        boolean flag = true;
        
        while(flag){
            System.out.print("Give me a number (x > 9): ");
            if (cs.hasNextInt()) {
                num = cs.nextInt();
                if (num < 10) {
                    System.out.println("Number needs to be higher than 9");
                    System.exit(0);
                }
            }else{
                System.out.println("Invalid value");
                System.exit(0);
            }
            values.add(num);
            
            flag = anotherTry();
        }
        
        for (int n: values) {
            System.out.print(n + " / " + ((addDigits(n)<10)? "Is less than 10" 
                            : "Is grater than 10"));
            System.out.println();
        }
    }
    
    public boolean anotherTry(){
        Scanner cs = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Add another number? (y / n): ");
            if (cs.hasNextLine()) {
                char temp;
                temp = cs.nextLine().charAt(0);
                switch (temp) {
                    case 'Y', 'y' -> {
                        return true;
                    }
                    case 'N', 'n' -> {
                        return false;
                    }
                    default -> System.out.println("Invaid value");
                }
            }
        }
        
        return true;
    }
    
    public int addDigits(int value){
        int result = 0;
        String temp = Integer.toString(value);
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            result += Integer.parseInt(Character.toString(c));
        }
        return result;
    }
    
}
