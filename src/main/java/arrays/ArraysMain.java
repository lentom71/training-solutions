package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String szorzotabla(int hossz) {
        int[][] multiplicationTable = new int[hossz][hossz];
        for (int i = 0; i < hossz; i++) {
            for (int j = 0; j < hossz; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }


    public static void main(String[] args) {
        ArraysMain szorzocska = new ArraysMain();
        System.out.println(szorzocska.szorzotabla(6));
    }
}