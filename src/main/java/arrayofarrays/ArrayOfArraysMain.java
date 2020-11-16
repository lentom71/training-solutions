package arrayofarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfArraysMain {
    public int[][] haromszogMatrix(int size)
    {
        int[][] Matrix = new int[size][];
        for(int i=0; i<size; i++)
        {
            Matrix[i] = new int[i + 1];
            for(int j=0; j<i+1; j++)
            {
                Matrix[i][j] = i;
            }
        }
        return  Matrix;
     }

    public static void main(String[] args) {
        System.out.println("Add meg a Mátrix méretét:");
        Scanner scanner = new Scanner(System.in);
        int megadottsize = scanner.nextInt();
        ArrayOfArraysMain tombocske = new ArrayOfArraysMain();
        System.out.println(Arrays.deepToString(tombocske.haromszogMatrix(megadottsize)));
    }
}
