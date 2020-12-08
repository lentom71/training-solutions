package week07.d02;

import javax.swing.*;

public interface User
{
   public  String getUsername();

   public  String getFirstName();

   public String getLastName();

   default String getFullName()
   {
       return getFirstName() + "  " + getLastName();
   }

   static User  of(String username, String firstname, String lastname)
   {
       return  new UserImpl (username, firstname, lastname );
   }


   static  void letr()
   {
       User user = new UserImpl("kovacs", "jozsi", "feri");
   }
}
