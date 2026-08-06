package logic.exercises;

import java.io.IOException;
import logic.exercises.exercises.*;

/**
 *
 * @author stredhy
 */
public class Main {
    public static void main(String[] args) throws IOException{ 
        
        try{
           Exercise14 ej = new Exercise14();

           ej.execute();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        /*
        */
    }
}
