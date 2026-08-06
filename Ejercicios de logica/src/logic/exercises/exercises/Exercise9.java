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
public class Exercise9 {
    private Scanner cs = new Scanner(System.in);
    
    private int number;
    
    private int fibonacci(int n){
        if(n <= 1){
            return n;
        }
                
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public void execute(){
        System.out.print("Tell me a number you want to see the fibonacci serie: ");
        if(cs.hasNextInt()){
            number = cs.nextInt();
            cs.nextLine();
            System.out.println("Here you are the first " + number + " number(s) of fibonacci serie:");
            for(int i = 0; i < number; i++){
                System.out.println((i+1) + ".- " + fibonacci(i));
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
