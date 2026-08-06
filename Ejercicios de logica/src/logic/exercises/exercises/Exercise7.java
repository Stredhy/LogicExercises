/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.exercises.exercises;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise7 {
    private Scanner cs = new Scanner(System.in);
    private long number;
    
    public void execute() throws InterruptedException{
        System.out.println("Here it's going to plus all digits you write besides digits generated, knowing this...");
        Thread.sleep(3000);
        
        System.out.print("Give me a great number: ");
        if(cs.hasNextLong()){
            number = cs.nextLong();
            System.out.println("The result is: " + plus(number));
        }else{
            System.out.println("Invalid Value");
        }
        cs.close();
    }
    
    private int plus(long num){
        int result=0;
        do{

            for(char c : Long.toString(num).toCharArray()){
                if (Character.isDigit(c)) {
                    result += Character.getNumericValue(c);
                }
            }
            num = result;
            if(Integer.toString(result).length()>1){
                result = 0;
            }
        }while(Long.toString(num).length()>1);
       return result;
    }
}
