package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + " "  + name;
        message = message + "444";
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println("A b állítása:"  +  b);
        System.out.println("A c állítása:"  +  c);

        String ures1 = "";
        String ures2 = "";
        String ures3 = ures1 + ures2;
        System.out.println("Az ures3 hossza:"  + ures3.length());

        String abc = "Abcde";
        System.out.println("Az Abcde hossza:"  + abc.length());
        System.out.println("Az Abcde 1. és 3. karaktere:"  + abc.substring(0, 1)  +  "   és    "  +   abc.substring(2, 3));
        System.out.println("Az Abcde első  3  karaktere:"  +   abc.substring(0, 3));
    }
}
