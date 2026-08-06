package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_6 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num = 0;
        String numStr;
        
        System.out.print("Give a number (1000 - 9999): ");
        if (cs.hasNextInt()) {
            num = cs.nextInt();
            
            if(num < 1000 || num > 9999) {
                System.out.println("That nunber is not avalible"); 
                System.exit(0);
            }
            
            numStr = Integer.toString(num);
            
            String temp1, temp2;
            temp1 = numStr.substring(0, 2);
            temp2 = numStr.substring(2, 4);
            
            int num1 = Integer.parseInt(String.valueOf(temp1.charAt(0)))
                    , num2 = Integer.parseInt(String.valueOf(temp1.charAt(1)))
                    , num3 = Integer.parseInt(String.valueOf(temp2.charAt(0)))
                    , num4 = Integer.parseInt(String.valueOf(temp2.charAt(1)));
            
            boolean isHappy = Integer.parseInt(temp1) > Integer.parseInt(temp2);
            boolean isCrescent = num1 < num2 && num2 < num3 && num3 < num4;
            
            if(isHappy){
                System.out.println("This number is happy");
            }else if(isCrescent){
                System.out.println("This number is crescent");
            }else{
                System.out.println("This number is unhappy");
            }
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        
    }
}
