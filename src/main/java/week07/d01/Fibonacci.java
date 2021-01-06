package week07.d01;

public class Fibonacci
{
    public long fib(int n)
    {
        if (n<0)
        {
            throw new ArithmeticException();
        }

        if(n==0)
        {
            return 0;
        }

        if (n==1)
        {
            return 1;
        }

        return fib(n-1)+ fib(n-2);


    }



}
