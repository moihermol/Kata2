
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    
    
    public static void main(String[] args) {
        
        //Integer[] data={1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        String[] data= {"Ana","Juan","Juan","Juan","Ana","Rosa"};
        
        Histogram histo= new Histogram(data);
        
         Map<String,Integer> histogr= histo.getHistogram();
        /*for (int i = 0; i < data.length; i++) {
            if(!histogram.containsKey(data[i])){
                histogram.put(data[i], 0);
            }
            histogram.put(data[i], histogram.get(data[i])+1);
        }*/
        
        /**for (int value : data) {
            histogr.put(value,histogr.containsKey(value)? histogr.get(value)+1 : 1);
        }*/
        
        for (String key : histogr.keySet()) {
            System.out.println(key + "-->" + histogr.get(key));
        }
        
        
    }
}
