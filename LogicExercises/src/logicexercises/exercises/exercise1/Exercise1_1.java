package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_1 {
    
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int hours = 0, fraccionIncome = 0, income;
        System.out.print("Hours worked? ");
        if(cs.hasNextInt()){
            hours = cs.nextInt();
        }else{
            System.out.println("Invalid value");
        }
        System.out.print("Income recieved by hour? ");
        if(cs.hasNextInt()){
            fraccionIncome = cs.nextInt();
        }else{
            System.out.println("Invalid value");
        }
        
        income = hours * fraccionIncome;
        
        System.out.println("Your income: " + income);
    }
}
