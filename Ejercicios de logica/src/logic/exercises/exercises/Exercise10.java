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
public class Exercise10 {
    private Scanner cs = new Scanner(System.in);
    private int num;
    
    private long factorial(int n){
            if(n < 0){
                throw new IllegalArgumentException("Negative input not allowed");
            }
            return (n <= 1) ? 1 : n * factorial(n-1);
    }
    public void execute() throws InterruptedException{
        System.out.println("We'll calculate factorial of an specific number, knowing this...");
        Thread.sleep(3000);
        
        System.out.print("Give me a number: ");
        if(cs.hasNextInt()){
            num = cs.nextInt();
            cs.nextLine();
            System.out.println("This is the result of " + num + "! = " + factorial(num));
        }else{
            System.out.println("Invalid value");
        }
        cs.close();
    }
}
