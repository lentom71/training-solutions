package week15.d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CovidOsszes
{
    public List<CovidesetszamOrszag>  count(BufferedReader reader) throws IOException
    {
        reader.readLine();

        String line;
        String prevCountry = "";
        int prevPopulation = 0;
        int sum = 0;
        List<CovidesetszamOrszag>  esetek = new ArrayList<>();

        while ((line = reader.readLine()) != null)
        {
            if(line.contains("Bonaire, Saint Eustatius and Saba"))
            {
                line = line.replace("Bonaire, Saint", "Bonaire Saint");
            }

            String[] parts = line.split(",");


            if(!parts[7].isBlank())
            {
                String country = parts[4];
                int population = Integer.parseInt(parts[7]);
                int number = Integer.parseInt(parts[2]);

                if(country.equals(prevCountry))
                {
                    sum += number;
                }
                else
                {
                    esetek.add(new CovidesetszamOrszag(prevCountry, prevPopulation, sum));
                    sum = number;
                }
                prevCountry = country;
                prevPopulation = population;
            }
        }

        esetek.add(new CovidesetszamOrszag(prevCountry, prevPopulation, sum));          //Ez  az  Utolsó   sor  miatt   kelll!!!
        System.out.println(esetek);

        Collections.sort(esetek, new Comparator<CovidesetszamOrszag>()
        {
            @Override
            public int compare(CovidesetszamOrszag o1, CovidesetszamOrszag o2)
            {
                return Double.valueOf(o2.aranyszam()).compareTo(Double.valueOf(o1.aranyszam()));
            }
        });
        System.out.println(esetek);
        return esetek.subList(0, 3);
    }


    public static void main(String[] args)
    {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("data.csv")))
        {
            new CovidOsszes().count(reader);
        }
        catch (IOException e)
        {
           throw new IllegalStateException("Nincs file", e);
        }
    }
}
