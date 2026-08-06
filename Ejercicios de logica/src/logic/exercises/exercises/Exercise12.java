/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.exercises.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise12 {
    public Scanner cs  = new Scanner(System.in);
    private String str1;
    private String str2;
    
    public void execute() throws InterruptedException{
        System.out.println("This is for compare words and know if those words are anagrams, knowing this...");
        Thread.sleep(3000);
        
        System.out.print("Give me the first word: ");
        str1 = cs.nextLine();
        
        System.out.print("Give me the second word: ");
        str2 = cs.nextLine();
        
        if(!verifyString(str1) || !verifyString(str2)){
            System.out.println("Try again");
        }
        System.out.println((bubbleSort(str1.toCharArray()).equals(bubbleSort(str2.toCharArray())))? 
                                        "Those words are anagrams": 
                                                "Those words are not anagrams");
    }
    
    public boolean verifyString(String str){
        str = str.toLowerCase();
        if(str == null || str.isEmpty() || !str.matches("[a-z]+")){
            System.out.println("This is not a word: " + str);
            return false;
        }
        for(char c : str.toCharArray()){
            if(!Character.isLetter(c) || " ".equals(Character.toString(c))){
                System.out.println("This is not a word: " + str);
                return false;
            }
        }
        
        return true;
    }
    
    private String bubbleSort(char[] array){
        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    char aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return Arrays.toString(array);
    }
}
