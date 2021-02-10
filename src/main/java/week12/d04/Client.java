package week12.d04;

public class Client
{
    private String name;
    private String regNumber;

    private void checkString (String toCheck, String paramName)
    {
        if (toCheck == null || toCheck.isBlank())
        {
            throw new IllegalArgumentException(paramName + " must not null or empty");
        }
    }

    public Client(String name, String regNumber)
    {
        checkString(name, "Client name ");
        checkString(regNumber, "Registration number ");
        this.name = name;
        this.regNumber = regNumber.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
