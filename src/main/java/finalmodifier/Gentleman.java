package finalmodifier;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Jó napot kivánok  ";

    public String sayHello(String name)
    {
        return  MESSAGE_PREFIX  +  name;
    }

    public static void main(String[] args) {
        Gentleman gent = new Gentleman();
        System.out.println(gent.sayHello("John Doe"));
    }
}