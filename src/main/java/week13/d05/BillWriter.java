package week13.d05;

import java.sql.SQLOutput;
import java.util.List;

public class BillWriter
{
    public String writeBills(List<BillItem> items, LineWriter linewriter)
    {
        StringBuilder sb = new StringBuilder();
        for (BillItem billItem: items)
        {
            String line = linewriter.writeLine(billItem);
            sb.append(line).append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args)   //Strategy  tervezési minta!!!
    {
        BillWriter billWriter = new BillWriter();
        List<BillItem> billItems = List.of(new BillItem("kenyér", 3, 10), new BillItem("tej", 5, 20));


          String result = billWriter.writeBills(billItems, new MultipleLineWriter());          // 1. megvalósítása

     /*   String esult = billWriter.writeBills(billItems, new LineWriter() {                   // 2. megvalósitása   BELSŐ osztállyal
            @Override
            public String writeLine(BillItem item)
            {
                return item.getName();
            }
          });

          String sult = billWriter.writeBills(billItems, (LineWriter) item -> item.getName()); // 3. megvalósitása  LAMBDA-val
     */

          System.out.println(result);
    }
}
