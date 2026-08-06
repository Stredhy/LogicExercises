package logicexercises.exercises.exercise4;

import java.util.Scanner;


//este ejecicio esta bien culero


/**
 *
 * @author stredhy
 */
public class Exercise4_3 {
    final int VERTEX_Y = 5;
    final int VERTEX_X = 5;
    final int HEIGHT = 10;
    final int WIDTH = 10;    
    
    public void execute(){
        
        Scanner cs = new Scanner(System.in);
        int pointX = 0;
        int pointY = 0;
        
        for (int j = 0; j < VERTEX_Y; j++) {
            for (int i = 0; i < VERTEX_X; i++) {
                System.out.print("█");
            }
            System.out.println();
        }
        
        System.out.print("Give me a X point: ");
        if (cs.hasNextInt()) {
            pointX = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.print("Give me a Y point: ");
        if (cs.hasNextInt()) {
            pointY = cs.nextInt();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.println((isInside(pointX, pointY))? "Is inside" : "Is out");
        //
        for (int i = 0; i < VERTEX_Y; i++) {
            for (int j = 0; j < VERTEX_X; j++) {
                System.out.print((i == pointY && j == pointX)? "*" : "█");
            }
            System.out.println();
        }
    }
    
    public boolean isInside(int x, int y) {
        return x >= VERTEX_X &&
               x <= VERTEX_X + WIDTH &&
               y >= VERTEX_Y &&
               y <= VERTEX_Y + HEIGHT;
    }
}
