
package java_duplicate_example_1;


public class Java_Duplicate_Example_1 {


    public static void main(String[] args) {
        
        try{
        String names[] = {"Prabeer", "Pradeep", "Navin", "Prabeer", "Pradeep"};
        
        for(int i = 0;i<names.length;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {
                if(names[i].equals(names[j]))
                {
                    System.out.println("Duplicates :"+names[i]);
                }
            }
        }
        
        }
        catch(Exception e)
        {
            System.out.println("An Error :"+e);
        }
        
    }
    
}
