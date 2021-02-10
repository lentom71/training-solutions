package week12.d03;

import java.util.Arrays;

public class AgeSorter
{

        public static void main(String[] args)
        {
            final int[] result = new AgeSorter().sortAges(new int[]{1, 23, 4, 8, 4, 78, 23, 67, 12, 81});
            System.out.println(Arrays.toString(result));
        }


        int[] sortAges(int[] ages)
        {
            int[] lookup = new int[131];
            for (int age : ages)
            {
                lookup[age] = lookup[age] + 1;
            }
            int[] result = new int[ages.length];
            int idx = 0;
            for (int num = 0; num < lookup.length; num++)
            {
                int numCount = lookup[num];
                if (numCount > 0)
                {
                    for (int j = 0; j < numCount; j++)
                    {
                        result[idx] = num;
                        idx++;
                    }
                }
            }
            return result;
        }
}

