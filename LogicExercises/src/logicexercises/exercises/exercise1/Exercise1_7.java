package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_7 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int clownWeight = 112, dollWeight = 75;
        int clown = 0, doll = 0, weight;
        System.out.print("Clowns sold: ");
        if(cs.hasNextInt()){
            clown = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Dolls sold: ");
        if(cs.hasNextInt()){
            doll = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        weight = (clownWeight * clown) + (dollWeight * doll);
        
        System.out.print("Total weight: " + weight + " g");
    }
}
