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

 /*   Írj egy CdvCheck.check() metódust (paraméterezése, visszatérési értéke kiderül a tesztesetből), mely kap egy adószámot, és eldönti róla, hogy helyes-e! A következőképp kell eldönteni. Fogni kell az első kilenc számjegyet, és megszorozni rendre 1, 2, ..., 9 számmal. Az eredményt kell összegezni, majd maradékos osztani 11-el. A 10. számjegynek meg kell egyeznie ezzel a számmal (maradékkal).

        Pl.:

        8365670003
        1 * 8 + 2 * 3 + 3 * 6 + ... + 9 * 0 = 124
        124 maradékos osztás 11-el = 3
        3 (maradék) == 3 (10. számhegy) - az adószám megfelelő   */
