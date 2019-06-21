
package java_duplicate_example_1;

import java.util.HashSet;
import java.util.Set;


public class Duplicate_Example_2 {

    public static void main(String[] args) {
        try{
            
            String names[] = {"Prabeer", "Pradeep", "Navin", "Prabeer", "Pradeep"};
            
            Set<String> store = new HashSet<String>();
            for(String name : names)
            {
                if(store.add(name)==false)
                {
                    System.out.println("Duplicate Names :"+name);
                }
            }
            
        }
        catch(Exception e)
        {
            System.out.println("An Error :"+e);
        }
    }
}
