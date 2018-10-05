import java.io.*;
import java.util.*;

public class Ic {
    
    
    public static void main(String[] args) throws IOException{
    
       Scanner sc = null;

        try{

             sc = new Scanner(new FileReader("1.in"));

        
  
      Map<String, String> mappen = new LinkedHashMap<String, String>();

       
        int length = sc.nextInt();
        while(sc.hasNext()){

                  String key = sc.next();
                  String value = sc.next();
                  if(mappen.get(key) == null){
                 mappen.put(key,value);
               }
         
            }

            int i = 0;

            for(String name: mappen.keySet()){


                String key = name;
                String value = mappen.get(name);

                if(i<12){

                System.out.println(key+" "+value);
               }

               i++;
            }


           




   
    } finally{
      sc.close();
    }
}
}
        
    