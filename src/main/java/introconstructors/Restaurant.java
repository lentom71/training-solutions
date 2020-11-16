package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<String> menu;
    String name;
    int capacity;

    List<String> getMenu()
    {
        return menu;
    }

    String getName()
    {
        return name;
    }

    int  getCapacity()
    {
        return capacity;
    }


    public Restaurant(String name, int numberOfTables)
    {
        this.name = name;
        capacity = 4*numberOfTables;
        feltoltes();
    }

    public void feltoltes()
    {
        menu = new ArrayList<>();
        menu.add("Gulyásleves");
        menu.add("Somloi galuska");
        menu.add("Turoscsusza");
    }
}


class RestaurantMain{
    public static void main(String[] args) {
        Restaurant resti =  new Restaurant("Vén Juhász", 10);
        System.out.println("Étterem neve:  "  + resti.getName());
        System.out.println("Étterem kapacitása:  "   +    resti.getCapacity());
        System.out.println("Étterem  menűje:   "      +    resti.getMenu());
    }
}