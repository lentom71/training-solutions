package week13.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Cities
{
    public City findFirst(BufferedReader reader)
    {
        List<City> cities = readCities(reader);
        return findFirstCityInList(cities);
    }

    private City findFirstCityInList(List<City> cities)
    {
        if (cities.size() == 0)
        {
            throw new IllegalArgumentException("No city");
        }
        cities.sort(new NameComperator());
        return cities.get(0);
    }

    public List<City> readCities(BufferedReader reader)
    {
        List<City> cities= new ArrayList<>();
        String line;
        try
        {
            elsosor_kihagyas(reader);
            while ((line = reader.readLine()) != null)
            {
                cities.add(City.createCityByLine(line));
            }
        }
        catch(IOException ioe)
        {
            throw new IllegalStateException("Can not read", ioe);
        }
        return cities;
    }

    public void elsosor_kihagyas(BufferedReader reader) throws IOException
    {
        reader.readLine();
    }

    public static void main(String[] args)
    {
        Cities cities = new Cities();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("iranyitoszamok-varosok-2021.csv")))
        {
            System.out.println(cities.findFirst(reader));

        }
        catch (IOException ioe)
        {
            throw new IllegalStateException("Nem nyithato a File", ioe);
        }
    }
}
