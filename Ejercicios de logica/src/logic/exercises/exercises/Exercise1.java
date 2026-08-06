package logic.exercises.exercises;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise1 {

    private Scanner cs = new Scanner(System.in);
    private int num;

    public void execute() throws InterruptedException {
        System.out.println("Here you can know if a number is even or odd, knowing this...");
        Thread.sleep(3000);
        System.out.print("Give me a number: ");
        if (cs.hasNextInt()) {
            num = cs.nextInt();
            cs.close();
            System.out.println((num % 2 == 0) ? "It's Even" : "It's Odd");
        } else {
            System.out.println("Invalid value");
        }
    }
}
