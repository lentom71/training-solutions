package week15.d04;

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public enum CharType
{
    MAGANHANGZO("aáeéiíoóöőüűuú"),
    MASSALHANGZO("yxcvbnmlkjhgfdsqwertzp"),
    MASOK("");

    private String betuk;

    CharType(String chars)
    {
        this.betuk = chars;
    }

    public String getChars()
    {
        return betuk;
    }

    public static CharType getType(int c)
    {
        if (CharType.MAGANHANGZO.betuk.contains(String.valueOf((char) c)))
        {
            return CharType.MAGANHANGZO;
        }
        if (CharType.MASSALHANGZO.betuk.contains(String.valueOf((char) c)))
        {
            return CharType.MASSALHANGZO;
        }
        return CharType.MASOK;
    }

/*    Igy  is   meg   lehetne   csinálni!!

    Function<String, IntStream> function = s -> s.chars();
    Predicate<String> stringPredicate = str -> str.contains("a");
    IntPredicate predicateLambda = i -> i!= CODE_OF_SPACE;
    IntPredicate predicate = new IntPredicate() {
        @Override
        public boolean test(int value) {
            return value != CODE_OF_SPACE;
        }
    };      */








}
