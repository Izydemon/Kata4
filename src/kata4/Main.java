package kata4;

public class Main {

   
    public static void main(String[] args) {
        
      Histogram<String> histogram = new Histogram();
      
      histogram.increment("dis.ulpgc.es");
      histogram.increment("gmail.com");
      histogram.increment("hotmail.com");
      histogram.increment("ulpgc.es");
      histogram.increment("dis.ulpgc.es");
      histogram.increment("gmail.com");
      histogram.increment("hotmail.com");
      histogram.increment("dis.ulpgc.es");
      
      HistogramDisplay histo = new HistogramDisplay(histogram);
      histo.execute();
    }
    
}