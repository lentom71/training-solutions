package week13.d03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rendezes
{
    public String  sortOfNumberOfPages(List<Book> books)
    {
        Map<String, Integer> authorsWithPageOfNumbers = new HashMap<>();
        for(Book book: books)
        {
            String author = book.getAuthor();
            int sum = authorsWithPageOfNumbers.get(author);
            sum = sum + book.getNumberOfPages();
            authorsWithPageOfNumbers.put(author, sum);
        }
        System.out.println(authorsWithPageOfNumbers);

        int maxNumberOfPages = 0;
        String  author = null;
        for(Map.Entry<String, Integer> entry:  authorsWithPageOfNumbers.entrySet())
        {
            if (entry.getValue() > maxNumberOfPages)
            {
                maxNumberOfPages = entry.getValue();
                author = entry.getKey();
            }
        }
        return  author;
    }
}
