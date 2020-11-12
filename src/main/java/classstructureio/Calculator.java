package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Irj be egy számot!");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Irj be egy másik  számot!");
        int y = scanner.nextInt();
        System.out.println(x + "+" + y);
        System.out.println(x+y);
    }
}
