package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_2 {
   public void execute(){
       Scanner cs = new Scanner(System.in);
       int age = 0, income = 0;
       
       System.out.print("Give me your age: ");
       if (cs.hasNextInt()) {
           age = cs.nextInt();
       }else{
           System.out.println("Invalid value");
           System.exit(0);
       }
       
       System.out.print("Give me your mensual income: ");
       if (cs.hasNextInt()) {
           income = cs.nextInt();
       }else{
           System.out.println("Invalid value");
           System.exit(0);
       }
       
       System.out.println((age > 16 && income >= 500)?
                        "You can pay taxes" : "You cannot pay taxes");
       
   } 
}
