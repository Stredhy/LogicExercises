/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.exercises.exercises;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise14 {
    private final static int MAX_ATTEMPS = 6;
    
    private Scanner cs = new Scanner(System.in);
    
    private String word;
    
    private char[][] hanged = {
                {' ',' ', ' '},
                {' ',' ', ' '},
                {' ',' ', ' '}
            };
    
    public void execute() throws InterruptedException, IOException{
        boolean flag;
        
        System.out.println("We'll play hangman, so let's start.");
        Thread.sleep(3000);
        
        System.out.println("But first of all, someone apart of you needs to enter a word you don't realize, knowing this...");
        Thread.sleep(3000);
        
        clearConsole();
        
        do{
            resetHanged();
            flag = play();
            clearConsole();
        }while(flag);
        
        System.out.println("Thanks for playing, see you later :D");
        cs.close();
    }
    
    private void resetHanged(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                hanged[i][j] = ' ';
            }
        }
    }
    
    public boolean verifyString(String str){
        str = str.toLowerCase();
        if(str == null || str.isEmpty() || !str.matches("[a-z]+")){
            System.out.println("This is not a word: " + str);
            return false;
        }
        for(char c : str.toCharArray()){
            if(!Character.isLetter(c)){
                System.out.println("This is not a word: " + str);
                return false;
            }
        }
        
        return true;
    }
    
    private void stringDecorated(String design,String str){
        for(int i = 0; i < 10; i++){
            System.out.print(design);
        }
        System.out.print(str);
        for(int i = 0; i < 10; i++){
            System.out.print(design);
        }
        System.out.println("");
    }
    
    private boolean play() throws IOException{
        System.out.print("NPC give me a word: ");
        word = cs.nextLine();

        clearConsole();
        if(!verifyString(word)){
            System.out.println("That's not a word, try again...");
            stringDecorated("░","Press ENTER to continue");
            cs.nextLine();
            return true;
        }
        
        StringBuilder auxString = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            auxString.append("_");
        }
        
        game(auxString);
        
        do{
            String answer;
            System.out.print("""
                              Do you want to play again?
                              [N/n]. No 
                              [Y/y]. Yes 
                              Answer: """);
            answer = cs.nextLine();
            if(answer.length() == 1 && Character.isLetter(answer.charAt(0))){
                switch(answer.charAt(0)){
                    case 'N', 'n' -> {return false;}
                    case 'Y', 'y' -> {return true;}
                    default -> { clearConsole();}
                }
            }
            System.out.println("Invalid value, try again...");
        }while(true);
    }
    
    private void game(StringBuilder aux){
        int faults = 0;
        boolean finalize = false;
        boolean flag = false;
        do{
            String answer;
            printGallows(flag,aux.toString());
            System.out.printf("%nGive me a letter: ");
            answer = cs.nextLine();
            if(answer.length() == 1 && Character.isLetter(answer.charAt(0))){
                if(isOnWord(answer.charAt(0))){
                    for(int i = 0; i < word.length(); i++){
                        if(answer.charAt(0) == word.charAt(i)){
                            aux.replace(i, i+1, Character.toString(answer.charAt(0)));
                        }
                    }
                    flag = false;
                }else{
                    flag = true;
                    faults++;
                    stringDecorated("~", "You are wrong");
                    stringDecorated("░","Press ENTER to continue");
                    cs.nextLine();
                }
                
            }else{
                System.out.println("Invalid value, try again...");
                stringDecorated("░","Press ENTER to continue");
                cs.nextLine();
            }
            
            if(faults == MAX_ATTEMPS){
                printGallows(flag, aux.toString());
                stringDecorated(".", "You lose");
                System.out.println("This was the right word: " + word);
                stringDecorated("░","Press ENTER to exit");
                cs.nextLine();
                finalize = true;
            }
            
            if(word.equals(aux.toString())){
                printGallows(flag, aux.toString());
                stringDecorated("★", "You win");
                stringDecorated("░","Press ENTER to exit");
                cs.nextLine();
                finalize = true;
            }
            
            clearConsole();
        }while(!finalize);
    }
    
    private boolean isOnWord(char letter){
        for(char c : word.toCharArray()){
            if(letter == c){
                return true;
            }
        }
        return false;
    }
    
    private void printGallows(boolean wrong, String aux){
        int i,j;
        if(wrong){
            foult();
        }
        for(i = 0; i < 5; i++){
            System.out.print("_");
        }
        System.out.printf("%n|%4s%n","|");
        for(i = 0; i < 3; i++){
            System.out.printf("|%2c",' ');
            for(j = 0; j < 3; j++){
                System.out.printf("%c",hanged[i][j]);
            }
            System.out.println("");
        }
        System.out.println(aux);
    }
    
    private void foult(){
        for(int i = 0; i < 3; i++){
            for(int j = 0;  j < 3; j++){
                if(checkHangedIndex(i, j)){
                    continue;
                }
                char aux = hanged[i][j];
                hanged[i][j] = setFoult(i,j);
                if(hanged[i][j] != aux){
                    return;
                }
            }
        }
    }
    
    private char setFoult(int i, int j){
       return switch(i){
            case 0 -> 'O';
            case 1 ->
                 switch(j){
                    case 0 -> '/';
                    case 1 -> '|';
                    default -> '\\';
                };
            default->
                (j == 0)? '/' : '\\';
        };
    }
    
    private boolean checkHangedIndex(int i, int j){
        boolean topLef = i == 0 && j == 0;
        boolean topRight = i == 0 && j == 2;
        boolean bottomCenter = i == 2 && j == 1;
        return topLef || topRight || bottomCenter;
    }
    
    private void clearConsole(){
        for(int i = 0; i < 50; i++){
            System.out.println("");
        }
    }
}
