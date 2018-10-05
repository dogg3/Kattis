import java.io.*;
import java.util.*;

class Autori {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{

            sc = new Scanner(new FileReader("autori.1.in"));
            sc.useDelimiter("");
            List<String> result = new ArrayList<String>();

            while(sc.hasNext()){
                
                   

        
                result.add(sc.next());


            }

                for(String c: result){
                    if(c.matches("[A-Z]{1}")){
                        System.out.print(c);
                    }
                }
       

        }finally{

            sc.close();

        }

        }
        
    }