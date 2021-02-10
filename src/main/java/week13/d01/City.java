package week13.d01;

public class City
{
    private String number;
    private String name;
    private String part;

    public City()
    {
    }

    public City(String number, String name, String part)
    {
        this.number = number;
        this.name = name;
        this.part = part;
    }

    public static City createCityByLine(String fullRepresentation)
    {
        City city = new City();
        String[] parts = fullRepresentation.split(";");
        city.number = parts[0];
        city.name = parts[1];
        if(parts.length > 2)
        {
            city.part = parts[2];
        }
        return city;
    }


    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPart() {
        return part;
    }


    @Override
    public String toString()
    {
        return "City{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", part='" + part + '\'' +
                '}';
    }
}
