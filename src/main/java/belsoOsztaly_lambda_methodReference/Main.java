package belsoOsztaly_lambda_methodReference;

public class Main
{
    public static void main(String[] args)                        //INTERFACE            MEGVALÓSITÁSA!
    {
        System.out.println(new UserSzuro()                                 //BELSŐ osztéllyal...
        {
            @Override
            public void usersz(User user)
            {
                user.getName();                                            //     VAGY
            }
        });



        System.out.println((UserSzuro) user -> user.getName());            //LAMBDA-val...

                                                                           //     VAGY

        System.out.println((UserSzuro) User::getName);                     //METHOD REFERENCE-el...
    }
}
