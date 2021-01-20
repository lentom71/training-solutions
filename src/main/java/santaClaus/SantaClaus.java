package santaClaus;

import java.util.List;

public class SantaClaus
{
    List<Person> persons;

    public SantaClaus(List<Person>  persons)
    {
        this.persons =  persons;
    }

    public void getThroughChimneys()
    {
        for (Person p : persons)
        {
            p.setPresent();
        }
    }
}
