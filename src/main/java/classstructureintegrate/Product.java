package classstructureintegrate;

import java.util.Scanner;

public class Product {
    String name;
    int price;

    public Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return  name;
    }

    public int getPrice()
    {
        return  price;
    }

    public void increasePrice()
    {
        price++;
    }

    public void decreasePrice()
    {
        price = price-2;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a termék Nevét!");
        String nev = scanner.nextLine();
        System.out.println("Kérem a termék Árát!");
        int ar = scanner.nextInt();

        Product produkcio = new Product(nev, ar);

        System.out.println("Termék Neve :" +  produkcio.getName());
        System.out.println("Termék Ára :"  +  produkcio.getPrice());

        produkcio.increasePrice();
        System.out.println("Termék Ára Nővelés után :"  +  produkcio.getPrice());
        produkcio.decreasePrice();
        System.out.println("Termék Ára Csökkentés után :"  +  produkcio.getPrice());
    }
}
