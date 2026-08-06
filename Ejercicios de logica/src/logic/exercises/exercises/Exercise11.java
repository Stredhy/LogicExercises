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
public class Exercise11 {
    private Scanner cs = new Scanner(System.in);
    
    public void execute() throws InterruptedException{
        System.out.println("You need to input a size to make an array and sort it, knowing this...");
        Thread.sleep(3000);
        System.out.print("Give me a size: ");
        if(cs.hasNextInt()){
            int[] array = fillArray(new int[cs.nextInt()]);
            cs.nextLine();
            
            System.out.println("Array generated: ");
            printArray(array);
            
            array = bubbleSort(array);
            
            System.out.println("Array sorted: ");
            printArray(array);
        }
    }
    
    private void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print((i != array.length-1)? 
                                    array[i] + ", " : 
                                        array[i] + ".");
        }
        System.out.println("");
    }
    
    private int[] fillArray(int[] array){
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
        }

        return array;
    }
    
    private int[] bubbleSort(int[] array){
        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }
}
