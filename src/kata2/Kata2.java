package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {0,1,2,3,1,5,6,7,8,1,10,2,5,13,7};
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }
    }
    
}
