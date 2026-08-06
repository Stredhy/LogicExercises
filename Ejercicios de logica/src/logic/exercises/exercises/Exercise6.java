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
public class Exercise6 {
    private Scanner cs = new Scanner(System.in);
    private String myStr;
    
    private boolean isPalindrome(String word){
        StringBuilder aux = new StringBuilder();
        word =  word.replace(" ", "").toLowerCase();
        for(var i  = word.length(); i > 0; i--,aux.append(word.charAt(i-1))){}
        return (word.equals(aux.toString()));
    }
    
    public void execute() throws InterruptedException{
        System.out.println("Here you will be able to know if your word or number is a palindrome, knowing this...");
        Thread.sleep(3000);
        System.out.print("Give me a word: ");
        myStr = cs.nextLine();
        cs.close();
        
        System.out.println((isPalindrome(myStr))? "This word is a palindrome" : "That's not a palindrome");
    }
}
