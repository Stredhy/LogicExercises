package logicexercises.exercises.exercise2;

import java.util.Scanner;

/**
 *
 * @author stredhy
 */
public class Exercise2_4 {
    public void execute(){
        final double POUND = 2.20462;
        
        Scanner cs = new Scanner(System.in);
        double weight = 0, height = 0, imc = 0, pound = 0, cm = 0;
        
        System.out.print("Give me your weight (kg): ");
        if (cs.hasNextDouble()) {
            weight = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        System.out.print("Give me your height (m): ");
        if (cs.hasNextDouble()) {
            height = cs.nextDouble();
        }else{
            System.out.println("Invalid value");
            System.exit(0);
        }
        
        imc = weight / (height * height);
        pound = weight * POUND;
        cm = height * 100; 
        
        System.out.println("########### Patient data ###########"
                + "\n   Height: " + cm + " cm"
                + "\n   Weight: " + pound + "pounds"
                + "\n   IMC: " + imc);
        
        if (imc < 16) {
            System.out.println("    Admission criteria");
        }else if(imc > 15 && imc < 17){
            System.out.println("    Underweight");
        }else if(imc > 16 && imc < 18.5){
            System.out.println("    Low weight");
        }else if(imc > 18.4 && imc < 25){
            System.out.println("    Normal weight");
        }else if(imc > 24.9 && imc < 30){
            System.out.println("    Overweight");
        }else if(imc > 29.9 && imc < 40){
            System.out.println("    Premorbid obesity");
        }else if(imc > 39.9 && imc < 45){
            System.out.println("    Morbid obesity");
        }else{
            System.out.println("    Hypermorbid obesity");
        }
    }
}
