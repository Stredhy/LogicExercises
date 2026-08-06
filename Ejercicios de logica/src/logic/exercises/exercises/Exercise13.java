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
public class Exercise13 {
    private Scanner cs = new Scanner(System.in);
    
    private int number;
    
    public void execute() throws InterruptedException{
        System.out.println("We'll convert a integer to binary number, then let's start...");
        Thread.sleep(3000);
        
        System.out.print("Give me a number: ");
        
        if (cs.hasNextInt()) {
            number = cs.nextInt();
            System.out.println("This is the number you entered: " + number);
            System.out.println("Its binary form: " + becomeToBinary(number));
        }else{
            System.out.println("Ivalid value");
        }
        
        cs.close();
    }
    
    //  00000001 -> -1  = 11111111
    //  00000101 -> -5 = 11111011
    //  00000010 -> -2 = 11111110
    
    private String becomeToBinary(int num){ // Transform a decimal to binary
        boolean flag = num < 0;
        num = Math.abs(num);
        String binaryNumber = "";
        
        // get only module of num and add as a binary number
        do{
            binaryNumber = (num % 2) + binaryNumber;
            num/=2;
        }while(num > 0);
        
        binaryNumber = fillBinaryString(binaryNumber);

        return flag ? applyTwoComplement(binaryNumber) : binaryNumber;
    }
    
    private String invertBinaryString(String str){ // invert 1 to 0 and 0 to 1
        String aux = str.replace("0", "2");
        
        aux = aux.replace("1", "0");
        aux = aux.replace("2", "1"); 
        
        return aux;
    }
    
    private String applyTwoComplement(String str){ // plus 1 to the final binary number
        StringBuilder aux = new StringBuilder(invertBinaryString(str)).reverse();
        
        for(int i = 0; i < aux.length(); i++){
            if(String.valueOf(aux.charAt(i)).equals("0")){
                aux.replace(i, i+1, "1"); // replace by 1
                break;
            }
            aux.replace(i,i+1,"0");// replace by 0
        }
        return aux.reverse().toString();
    }
    
    private String fillBinaryString(String s){ // Binary incresed
        int size = 8;
        
        if(s.length() >= 8 && s.length() < 16){size = 16;}
        if(s.length() >= 16 && s.length() < 32){size = 32;}
        if(s.length() >= 32){size = 64;}
        
        while(s.length()<size){
            s = "0" + s;
        }
        return s;
    }
}
