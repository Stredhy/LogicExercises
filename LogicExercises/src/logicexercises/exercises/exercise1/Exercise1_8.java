package logicexercises.exercises.exercise1;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1_8 {
    public void execute(){
        Scanner cs = new Scanner(System.in);
        double speed, time = 0, distance = 0;
        System.out.print("Give me the time: ");
        if(cs.hasNextDouble()){
            time = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("Give me the distance: ");
        if (cs.hasNextDouble()) {
            distance = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        speed = distance / time;
        
        System.out.println("This is the speed: " + speed);
    }
}
