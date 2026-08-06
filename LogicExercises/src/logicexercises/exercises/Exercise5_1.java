package logicexercises.exercises;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise5_1 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        String[] subjects = {"Math", "Physics", "Chemisty",
                            "History", "Languaje"};
        int[] grade = new int[5];
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Give me your score of " + subjects[i] + ": ");
            if (cs.hasNextInt()) {
                grade[i] = cs.nextInt();
            }else{
                System.out.println("Invalid value");
                System.exit(0);
            }
        }
        
        System.out.println("***********Your grades failed***********");
        for (int i = 0; i < subjects.length; i++) {
            if(grade[i] < 60){
                System.out.println(subjects[i] + ": " + grade[i]);
            }
        }
    }
}
