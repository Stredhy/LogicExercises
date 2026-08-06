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
public class Exercise2 {
    private Scanner cs = new Scanner(System.in);     
    private int[] nums = new int[4];
    
    public void execute() throws InterruptedException{
        System.out.println("Here you can find out which of three numbers is the biggest, knowing this...");
        Thread.sleep(3000);
        for(int i = 0; i < nums.length;){
            System.out.print("Give mi the number [" + (i+1) + "]: ");
            if(cs.hasNextInt()){
                nums[i] = cs.nextInt();
                i++;
            }else{
                System.out.println("Invalid value");
                cs.next();
            }
        }
        cs.close();
        System.out.println("The biggest number is : " + compare());
    }
    
    private int compare(){
        int aux = nums[0];
        
        for(int num : nums){
            if(aux < num){
                aux = num;
            }
        }
        
        return aux;
    }
}
