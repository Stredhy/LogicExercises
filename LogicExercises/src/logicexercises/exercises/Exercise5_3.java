package logicexercises.exercises;

import java.util.Arrays;

/**
 *
 * @author stredhy
 */
public class Exercise5_3 {
    public void execute(){
        int[][] matrixA = {{2,10}, {6, -3}};
        int[][] matrixB = {{15, -9},{7, -4}};
        int[][] matrixC = new int[2][2];
        
        System.out.print(Arrays.deepToString(matrixA) + " + " 
                        + Arrays.deepToString(matrixB) + " = ");
        
        
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        System.out.print(Arrays.deepToString(matrixC));
    }
}
