package week13.d01;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NameComperator implements Comparator <City>
{
    @Override
    public int compare(City  city1, City city2)
    {
        Collator collator = Collator.getInstance(new Locale("Hu", "HU"));
        return collator.compare(city1.getName(), city2.getName());
    }
}
