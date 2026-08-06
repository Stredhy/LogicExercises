package logicexercises.exercises.exercise4;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise4_2 {
    final String[] MONTHS = {"January", "February", "March", "April", "May",
                        "June", "July", "August", "September",
                        "October", "November", "December"};    
    public void execute(){
        Scanner cs = new Scanner(System.in);
        int month = 0;
        char conf;
        boolean leapYear = false;
        System.out.print("Which month do you choose? (1 - 12): ");
        if (cs.hasNextInt()) {
            month = cs.nextInt();
            if(month > 12){
                System.out.println("Invalid month");
                System.exit(0);
            }
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.print("This year is a leap year? (Y / N): ");
        if (cs.hasNextLine()) {
            cs.nextLine();
            conf = cs.nextLine().charAt(0);
            
            switch (conf) {
                case 'Y', 'y' -> leapYear = true;
                case 'N', 'n' -> leapYear = false;
                default -> {
                    System.out.println("Invalid value");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println("Have been " 
                + getDaysUntilThisMonth(month, leapYear) 
                + " days until this month");
    }
    
    public int getDaysUntilThisMonth(int month, boolean leapYear){
        int days = 0;
        
        for (int i = 0; i < month ; i++) {
            switch(MONTHS[i]){
                case "February" -> days += (leapYear)? 29 : 28;
                case "January", "March", "May", "July", "August",
                        "October", "December" -> days += 31;
                case "April", "June", "September", "November" -> days += 30;
                default -> {
                } 
            }
        }
        
        return days;
    }
}
