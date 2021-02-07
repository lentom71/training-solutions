package week14.d03;

public class User
{
    private String name;
    private int age;
    private String address;


    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}



/*    Mai senior feladat:
      Adott egy User osztály:

     public class User
     {
         private String name;
         private int age;
         private String address;
     }

     és egy UserFilter interfész:


    @FunctionalInterface
     public interface UserFilter
     {
          List<User> filter(List<User> users);
     }

     Készíts hozzá egy UserFilters osztályt, mely filter objektumokat képes gyártani az alábbi módon lambdak felhasznalasaval:

     public class UserFilters
     {
          public UserFilter createFilter(List<Predicate<User>> predicates)
     }

        Példa:


public class Main
{
   public static void main(String[] args)
    final UserFilter filter = new UserFilters().createFilter(Arrays.asList(
            (user) -> user.getAge() > 18,
            (user) -> user.getName().startsWith("A")
    ));        System.out.println(filter.filter(new ArrayList<>(Arrays.asList(
            new User("Marton", 16, "Racz Aladar utca 99/b"),
            new User("Attila", 19, "Kazmer utca 4")
    ))));
}
}     */

