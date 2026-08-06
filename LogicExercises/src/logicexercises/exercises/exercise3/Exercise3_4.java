package logicexercises.exercises.exercise3;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise3_4 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        boolean flag = true;
        int num = 0;
        int pairHoarder = 0, oddHoarder = 0, totalHoarder = 0;
        int pairCounter = 0, oddCounter = 0;
        int numberTotal = 0;
        
        while(flag){
            System.out.print("Give me a number: ");
            if (cs.hasNextInt()) {
                num = cs.nextInt();
                
                if (num % 2 != 0) {
                    oddCounter++;
                    oddHoarder += num;
                }else{
                    pairCounter++;
                    pairHoarder += num;
                }
                
                totalHoarder += num;
                numberTotal++;
                
            }else{
                System.out.println("Invalid value");
                System.exit(0);
            }
            flag = tryAgain();
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Pair sum: " + pairHoarder);
        System.out.println("Odd sum: " + oddHoarder);
        System.out.println("Sum total: " + totalHoarder);
        System.out.println();
        System.out.println("Pair counter: " + pairCounter);
        System.out.println("Odd conter: " + oddCounter);
        System.out.println("Total number of numbers: " + numberTotal);
        System.out.println("Pair percentage: " 
                            + percentage(numberTotal, pairCounter));
        System.out.println("Odd percentage: " 
                            + percentage(numberTotal, oddCounter));
    }
    
    public boolean tryAgain(){        
        boolean flag = true;
        
        while(flag){
            Scanner cs = new Scanner(System.in);
            char answer = 0;
            System.out.print("You want to get into again (y/n): ");
            answer = cs.nextLine().charAt(0);
            switch (answer) {
                case 'Y', 'y' -> {
                    return true;
                }
                case 'N', 'n' -> {
                    return false;
                }
                default -> System.out.println("Invalid character");
            }
        }
        return true;
    }
    
    public double percentage(double divisor, double dividend){
        return (dividend/divisor) * 100;
    }
    
}
