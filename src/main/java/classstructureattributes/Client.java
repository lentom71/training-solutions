package classstructureattributes;

import java.util.Scanner;

public class Client {
    String name;
    int szuletesiev;
    String cim;
}

class ClientMain {
    public static void main(String[] args) {

        Client kliens = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ird be a Nevet!");
        kliens.name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ird be a Születési évét!");
        kliens.szuletesiev = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ird be a Lakcímét!");
        kliens.cim = scanner2.nextLine();

        System.out.println("A kliens neve :" +  kliens.name);
        System.out.println("A kliens születési éve :" +  kliens.szuletesiev);
        System.out.println("A kliens lakcíme :" +  kliens.cim);
    }
}