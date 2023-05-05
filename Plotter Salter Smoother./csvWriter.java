import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class csvWriter
{
    public csvWriter()
    {
    }

    //csv file writer
    public void writeToCsv(List<Point> pointList)
    {
        try
        {
            //parser for csv file
            CSVPrinter printer =
                    new CSVPrinter(new
                            FileWriter("test2.csv"),
                            CSVFormat.DEFAULT);

            for(Point p : pointList)
            {
                printer.printRecord(p.x,p.y);
            }
            printer.flush();
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ex2)
        {
            ex2.printStackTrace();
        }
    }
}
