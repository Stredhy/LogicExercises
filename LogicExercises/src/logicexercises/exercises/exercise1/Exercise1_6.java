package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_6 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int num;
        System.out.print("Write a nunber of 4 digits: ");
        if(cs.hasNextInt()){
            num = cs.nextInt();
            if(num >= 1000 && num < 10000){
                String temp = new StringBuilder(Integer.toString(num))
                        .reverse().toString();
                System.out.print("Invertion: ");
                num = Integer.parseInt(temp);
                System.out.println(num);
            }else{
                System.out.println("Invalid value");
                System.exit(0);
            }
        }else{
                System.out.println("Invalid value");
                System.exit(0);
            }
    }
}
