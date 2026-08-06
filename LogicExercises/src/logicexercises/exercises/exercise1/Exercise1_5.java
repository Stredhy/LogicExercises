/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_5 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        double opposite = 0, adjacent = 0, hypotenuse = 0;
        
        System.out.print("Give me the oposite side: ");
        if(cs.hasNextDouble()){
            opposite = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me the adjacent side: ");
        if(cs.hasNextDouble()){
            adjacent = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        hypotenuse = Math.sqrt(Math.pow(opposite, 2) + 
                                Math.pow(adjacent, 2));
        
        System.out.println("The hypotenuse is: " + hypotenuse);
    }
}
