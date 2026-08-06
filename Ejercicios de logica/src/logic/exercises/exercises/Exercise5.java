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
public class Exercise5 {
    private Scanner cs = new Scanner(System.in);
    private String num;
    public void execute(){
        System.out.println("This is for couting how many digits have a number, knowing this...");
        
        System.out.print("Give me a number: ");
        num = cs.nextLine();

        System.out.println("Your number has "+ countDigits() + " digit(s)");

        cs.close();
    }
    
    private int countDigits(){
        int count=0;
        for (char c: num.toCharArray()) {
            if(Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }
}
