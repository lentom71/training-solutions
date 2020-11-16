package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int x = scanner.nextInt();
        if(x%3 == 0)
        {
            System.out.println("Szám osztható 3-al!");
        }
        else
        {
            System.out.println("Szám nem osztható 3-al!");
        }
    }
}
