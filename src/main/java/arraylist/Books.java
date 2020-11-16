package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> konyvek = new ArrayList<>();

    public void hozzaad(String cim)
    {
        konyvek.add(cim);
    }

    public List<String>  findAllByPrefix(String prefix)
    {
        List<String> talalt = new ArrayList<>();
        for (String konyv : konyvek)
        {
            if (konyv.startsWith(prefix))
            {
                talalt.add(konyv);
            }
        }
        return talalt;
    }

    public List<String> getTitles()
    {
      return konyvek;
    }

    public static void main(String[] args) {
        Books book = new Books();
        book.hozzaad("Winnetou");
        book.hozzaad("Magyar Atom");
        book.hozzaad("Zabhegeyező");

        System.out.println(book.getTitles());
        System.out.println(book.findAllByPrefix("Zab"));
    }
}
