package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_1 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        double num1 = 0, num2 = 0, result;
        
        
        System.out.print("Give me a number: ");
        if (cs.hasNextDouble()) {
            num1 = cs.nextDouble();
        }else{
            System.out.println("Ivalid value");
        }
        
        System.out.print("Give another number: ");
        if (cs.hasNextDouble()) {
            num2 = cs.nextDouble();
        }else{
            System.out.println("Ivalid value");
        }
        result = num1 / num2;
        
        if(num1 == 0){
            System.out.println("Error");
            System.exit(0);
        }
        
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}
