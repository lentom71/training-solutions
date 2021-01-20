package week11d03;

import java.util.HashSet;
import java.util.Set;

public class CharCounter
{
    static int countChars(String[] chars)
    {
        int result = 0;
        if(chars.length > 0)
        {
            Set<Character> first = new HashSet<>();
            for (char c : chars[0].toCharArray())
            {
                first.add(c);
            }
            for (int i = 1; i < chars.length; i++)
            {
                Set<Character> next = new HashSet<>();
                for (char c : chars[i].toCharArray())
                {
                    next.add(c);
                }
                first.retainAll(next);
            }
            result = first.size();
        }
        return result;
    }
}
