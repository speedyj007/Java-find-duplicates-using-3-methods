
package java_duplicate_example_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Duplicate_Example_3 {

    public static void main(String[] args) {
        
        try{
            String names[] = {"Prabeer", "Pradeep", "Navin", "Prabeer", "Pradeep"};
            Map<String, Integer> store = new HashMap<String,Integer>();
            for(String name:names)
            {
            Integer count = store.get(name);
            if(count==null)
            {
                store.put(name, 1);
            }
            else{
                store.put(name,++count);
            }
            }
            
            Set<Entry<String, Integer>> entrySet = store.entrySet();
            for(Entry<String,Integer> entry :entrySet)
            {
                if(entry.getValue()>1)
                {
                    System.out.println("Duplicates names : "+entry.getKey());
                }
            }
            
        }
        catch(Exception e)
        {
            System.out.println("An Error :"+e);
        }
    }
}
