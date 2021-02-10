package belsoOsztaly_lambda_methodReference;

import java.util.function.Function;

public class Main
{
    public static void main(String[] args)                        //INTERFACE      MEGVALÓSITÁSA!
    {
        System.out.println(new UserSzuro()                                                       //BELSŐ osztéllyal...
        {
            @Override
            public String  usersz(User user)
            {
                return user.getName();                                                           //     VAGY
            }
        }.usersz(new User("Tomi")));


        System.out.println(((UserSzuro) user -> {                                                //LAMBDA-val...
            return user.getName();
        }).usersz(new User("Tomi")));

                                                                                                 //     VAGY
        System.out.println(((UserSzuro) User::getName).usersz(new User("Tomi")));          //METHOD REFERENCE-el...

                                                                                                 //     VAGY
        System.out.println(new Function<User, String>() {                                        //BEÉPITETT   BELSŐ
            @Override                                                                            //osztállyal
            public String apply(User user) {
                return user.getName();
            }
        }.apply(new User("Tomi")));
    }
}
