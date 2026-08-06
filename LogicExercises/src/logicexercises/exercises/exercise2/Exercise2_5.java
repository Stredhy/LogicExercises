package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_5 {
    public void execute(){
        final String[] months = {"January", "February", "March", "April", "May",
                        "June", "July", "August", "September",
                        "October", "November", "December"};
        Scanner cs = new Scanner(System.in);
        int month = 0;
        
        System.out.print("Which month you want to choose: ");
        if (cs.hasNextInt()) {
            month = cs.nextInt();
            month--;
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println((month >= 0 && month <= 11) ? 
                    "The month is: " + months[month] : "Month doesn't exist");
    }
}
