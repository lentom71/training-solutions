package week15.d05;

public class CovidesetszamOrszag
{
    private String country;
    private int population;
    private int number;

    public CovidesetszamOrszag(String country, int population, int number)
    {
        this.country = country;
        this.population = population;
        this.number = number;
    }

    public double  aranyszam()
    {
        if(population == 0)
        {
            return 0;
        }
        return number/(double) population;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getNumber() {
        return number;
    }



    public void addEsetek(int ujEsetek)     //Ez  a  metodus  csak  a Map-es  változahthoz  kell!!
    {
        number += ujEsetek;
    }
}
