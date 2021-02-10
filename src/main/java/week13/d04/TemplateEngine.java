package week13.d04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Map;

public class TemplateEngine
{
    public void merge(BufferedReader reader, Map<String, Object> values, BufferedWriter writer)
    {
        String line;
        try
        {
            while ((line = reader.readLine()) != null)
            {
                String merged = merge(line, values);
                writer.write(merged);
            }
        }
        catch (IOException e)
        {
            throw new IllegalStateException("Can't read from file!", e);
        }
    }

    private String merge(String line, Map<String, Object>values)
    {
        int index = 0;
        String result = line;
        while (result.indexOf("{", index)>0)
        {
            int indexOfOpen = result.indexOf("{", index);
            int indexOfClose = result.indexOf("}", index);
            String key = result.substring(indexOfOpen + 1, indexOfClose);
            String value = values.get(key).toString();
            result = result.replace("{" + key + "}", value );
            index = indexOfClose;
        }
        return result + "\n";
    }

    public static void main(String[] args)
    {
        Path template = Path.of("template.txt");
        Map<String, Object> values = Map.of("nev", "john Doe", "datum", LocalDate.of(2021, 02, 23), "osszeg", 25000, "hatarido", LocalDate.of(2021, 03, 30));
        StringWriter sw = new StringWriter();

        try (BufferedWriter writer = new BufferedWriter(sw);
             BufferedReader reader = Files.newBufferedReader(template))
        {
            new TemplateEngine().merge(reader, values, writer);
        }
        catch(IOException io)
        {
            throw new IllegalStateException("Can not read", io);
        }
        System.out.println(sw.toString());
    }
}


//Írj egy sablonkezelő rendszert! Hozz létre egy TemplateEngine nevezetű osztályt, benne egy
//void merge(BufferedReader reader, Map<String, Object>, BufferedWriter writer)
//metódussal. Az első paraméter a sablon, a második paraméter pedig az értékek, melyeket ki kell cserélni a sablonban.
//Képzeljük el, hogy ez a sablon:

//Kedves {nev}!
//Megküldjük önnek a következő esedékes számláját {datum} dátummal,
//melynek összege: {osszeg} Ft!
//A fizetési határidő {hatarido}.
//Üdvözlettel,
//Ügyfélszolgálat

//A metódus második paraméterként egy Map-ben kapja az értékeket:
//{"nev" = "John Doe", "datum" = LocalDate}
//A feladat, hogy a writer-be ki kell írni a levelet, de már
//kicserélve az értékeket. (edited)
