package week15.d05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CovidOsszesMapesMegoldas
{
    public List<CovidesetszamOrszag> count(BufferedReader reader) throws IOException {
        reader.readLine();
        String line;
        Map<String, CovidesetszamOrszag> esetek = new HashMap<>();

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

                if(!esetek.containsKey(country))
                {
                    esetek.put(country, new CovidesetszamOrszag(country, population, number));
                }
                else
                {
                    esetek.get(country).addEsetek(number);
                }
            }
        }

        List<CovidesetszamOrszag> esetekLista = new ArrayList<>(esetek.values());
        System.out.println(esetek);

        Collections.sort(esetekLista, new Comparator<CovidesetszamOrszag>() {
            @Override
            public int compare(CovidesetszamOrszag o1, CovidesetszamOrszag o2)
            {
                return Double.valueOf(o2.aranyszam()).compareTo(Double.valueOf(o1.aranyszam()));
            }
        });
        System.out.println(esetek);
        return esetekLista.subList(0, 3);
    }


    public static void main(String[] args)
    {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("data.csv")))
        {
            new CovidOsszesMapesMegoldas().count(reader);
        }
        catch (IOException e)
        {
            throw new IllegalStateException("Nincs file", e);
        }
    }
}
