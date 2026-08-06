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
public class Exercise8 {
    private Scanner cs = new Scanner(System.in);
    private int number;
    
    private boolean isPrimeNumber(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){return false;}
        }        
        return (num > 1);
    }
    
    public void execute() throws InterruptedException{
        System.out.println("Let's corroborate if a number is prime or not, knowing this...");
        Thread.sleep(3000);
        
        System.out.print("Give me a number: ");
        if (cs.hasNextInt()) {
            number = cs.nextInt();
            cs.nextLine();
            System.out.println((isPrimeNumber(number)) ? "This is a prime number" : "That's not a prime number");
            
        }else{
            System.out.println("Invalid value");
        }
        cs.close();
    }
}
