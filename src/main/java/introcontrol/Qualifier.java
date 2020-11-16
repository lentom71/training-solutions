package introcontrol;

import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy  számot!");
        double x = scanner.nextDouble();
        if (x>100)
        {
            System.out.println("Nagyobb mint 100");
        }
        else
        {
            System.out.println("100 vagy kisebb");
        }
    }
}
