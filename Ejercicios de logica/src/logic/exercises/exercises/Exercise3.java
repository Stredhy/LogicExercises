/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.exercises.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3 {
    private Scanner cs = new Scanner(System.in);
    private Random rand = new Random();
    private int randomNum;
    private int num;
    public void execute() throws InterruptedException{
        System.out.println("Try to guess a number between 0 and 100, knowing this...");
        randomNum = rand.nextInt(101);
        
        Thread.sleep(3000);
        if(cs.hasNextInt()){
            System.out.print("Which number do you think was generated? ");
            num = cs.nextInt();
            cs.close();
        }
        
        System.out.println((num == randomNum) ? "that's right" : "You are wrong, the right answer was " +randomNum);            
    }
}
