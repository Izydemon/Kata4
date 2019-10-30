package kata4;

import java.util.List;
import kata4_model.*;
import kata4_view.*;

public class Main {

    public static void main(String[] args) {
      String fileName = new String("email.txt");
      /* I */ List<Mail> mailList = MailListReader.read(fileName);
      /* P */ Histogram histogram = MailHistogramBuilder.build(mailList);
      
      /* O */ HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
      /* O */ histogramDisplay.execute();
    }
    
}