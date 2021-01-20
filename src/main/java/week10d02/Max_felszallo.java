package week10d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Max_felszallo
{
    public int getStopWithMax(InputStream inputStream)
    {
        //Be kell olvasni a file-t!
        List<Integer> numbers = readNumbers(inputStream);

        //Összegyűjteni a megállokhoz tartozó felszaállok számát/
        int[] sum = sum(numbers);

        //maximum keresés!
        return findMaxStopIndex(sum);
    }

    private List<Integer>  readNumbers(InputStream inputStream)
    {
        List<Integer>  numbers  =  new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)))
        {
            String line ;
            while  ((line = br.readLine()) != null)
            {
                String[] parts =  line.split(" ");
                numbers.add(Integer.parseInt(parts[0]));
            }
        }
        catch (IOException ioe)
        {
            throw new IllegalStateException("No parse", ioe);
        }
        return numbers;
    }

    private  int[]  sum(List<Integer> numbers)
    {
        int[] sum = new int[30];
        for (int number: numbers)
        {
            sum[number] = sum[number] + 1;
        }
        return sum;
    }

    private  int  findMaxStopIndex(int[] sum)
    {
        int maxPosition = 0;
        for (int i = 0; i < sum.length; i++)
        {
            if (sum[maxPosition] < sum[i])
            {
                maxPosition  = i;
            }
        }
        return maxPosition;
    }
}
