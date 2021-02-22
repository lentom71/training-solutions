package exam03_potvizsga.letter;

import java.util.ArrayList;
import java.util.List;

public class MailBox
{
    private List<Mail> mails;

    public List<Mail>  findByCriteria(String criteria)
    {
        List<Mail> lista = new ArrayList<>();
        String[] parts = criteria.split(":");
        if(parts[0].equals("from"))
        {
            for(Mail mail: mails)
            {
                if(parts[1].contains(" ")   &&  parts[1].equals(mail.from.getName()))
                {
                    lista.add(mail);
                }
                else if (parts[1].equals(mail.from.getEmail()))
                {
                    lista.add(mail);
                }
            }
            return lista;
        }

        if(parts[0].equals("to"))
        {
            for(Mail mail: mails)
            {
                for(Contact cont: mail.to)
                if(parts[1].contains(" ")  &&   parts[1].equals(cont.getName()))
                {
                    lista.add(mail);
                }
                else if (parts[1].equals(cont.getEmail()))
                {
                    lista.add(mail);
                }
            }
            return lista;
        }

        else
        {
            for(Mail mail: mails)
            {
                if(mail.message.contains(criteria)  ||  mail.subject.contains((criteria)))
                {
                    lista.add(mail);
                }
            }
            return lista;
        }
    }
}
