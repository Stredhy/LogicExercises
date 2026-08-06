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
public class Exercise4 {
    private Scanner cs = new Scanner(System.in);
    private int num;
    
    public void execute() throws InterruptedException{
        System.out.println("This is for showing a multiplication table of any number you want, knowing this...");
        Thread.sleep(3000);

        System.out.println("For which number do you want to know its multiplication table? ");
        if(cs.hasNextInt()){
            num = cs.nextInt();
            cs.close();
            for(int i = 0; i < 10; i++){
                System.out.println( num + " x " + (i+1) + " = " + (num*(i+1)));
            }
        }else{
            System.out.println("Invalid value");
        }
        
    }
}
