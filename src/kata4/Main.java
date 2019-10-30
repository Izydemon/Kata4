package kata4;

import java.io.IOException;
import java.util.List;
import kata4_model.Histogram;
import kata4_model.Mail;
import kata4_view.*;

public class Main {

    public static void main(String[] args) throws IOException {
      String fileName = new String("email.txt");
      /* I */ List<Mail> mailList = MailListReader.read(fileName);
      /* P */ Histogram histogram = MailHistogramBuilder.build(mailList);
      
      /* O */ HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
      /* O */ histogramDisplay.execute();
    }
    
}