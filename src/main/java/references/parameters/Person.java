package references.parameters;

public class Person {
    String name;
    int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int  getAge()
    {
        return age;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}


class ReferencesMain{
    public static void main(String[] args) {
        Person x;
        Person y;
        Person per1 = new Person("Géza", 55);
        x = per1;
        y = x;
        y.name = "Józsi";
        System.out.println("Az első változó tartalma : " + x + ", A második változó tartalma: " + y);


        int szam1 = 24;
        int szam2 = szam1+1;
        System.out.println("szam1  értéke: " + szam1 + ", szam2  értéke: " + szam2);

        Person per2 = new Person("Feri", 40);
        x = per2;
        System.out.println("Az első változó tartalma: " + x + ", A második változó tartalma: " + y);
    }
}
