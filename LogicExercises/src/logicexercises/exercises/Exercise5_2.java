package logicexercises.exercises;

import java.util.Scanner;


/**
 *
 * @author stredhy
 */
public class Exercise5_2 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        StringBuilder word;
        
        System.out.print("Give me a word: ");
        word = new StringBuilder(cs.nextLine());
        
        System.out.println(word.toString().equals(word.reverse().toString())
                ? "They are the same word" : 
                "They are not the same word");
    }
}
