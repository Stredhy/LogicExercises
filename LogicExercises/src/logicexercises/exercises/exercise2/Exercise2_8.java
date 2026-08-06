package logicexercises.exercises.exercise2;

import java.time.LocalDateTime;


/**
 *
 * @author stredhy
 */
public class Exercise2_8 {
    public void execute(){
        LocalDateTime localDate = LocalDateTime.now();
        int hour = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();
        int secondsByHour = hour * 3600;
        int secondsByMinute = minutes * 60;
        int totalSeconds = secondsByHour + secondsByMinute + seconds;

        System.out.println("The time is: "
                        + hour + ":" + minutes + ":" + seconds);
        System.out.println("Seconds elapsed all day: " + totalSeconds );
    }
}
