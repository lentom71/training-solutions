package exam03.exam03.hiszto;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram
{
    public String  createHistogram(BufferedReader reader)
    {
        String line;
        StringBuilder sb = new StringBuilder();
        try
        {
            while ((line = reader.readLine()) != null)
            {
                int starNumber = Integer.parseInt(line);
                for (int i = 0; i < starNumber; i++)
                {
                    sb.append("*");
                }
            }
            return sb.toString()+"\n";
        }
        catch (IOException e)
        {
            throw new IllegalStateException("Cannot read file");
        }
    }
}
