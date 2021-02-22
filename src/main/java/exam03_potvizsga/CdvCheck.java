package exam03_potvizsga;

import javax.swing.text.html.parser.Parser;

public class CdvCheck
{
    public boolean  check(String adoszam)
    {
        int sum = 0;
        for (int i =0; i<9; i++)
        {
            sum +=  Integer.parseInt(adoszam.substring(i, i + 1)) * i+1;
        }

        if (sum % 11 == Integer.parseInt(adoszam.substring(9, 10)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
