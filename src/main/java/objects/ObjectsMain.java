package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Konyv
{
}


public class ObjectsMain {
    public static void main(String[] args) {
        Konyv[] konyvek = {new Konyv(), new Konyv(), new Konyv()};

        List<Konyv> konyvek1 = Arrays.asList(new Konyv(), new Konyv());

        List<Konyv> konyvek2 = new ArrayList<>();
        konyvek2.add(new Konyv());
        konyvek2.add(new Konyv());
        konyvek2.add(new Konyv());
    }
}
