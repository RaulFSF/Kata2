package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {0,1,2,3,1,5,6,7,8,1,10,2,5,13,7};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            } else{
                histogram.put(data[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogram.get(entry.getKey()));
        }
    }
    
}
