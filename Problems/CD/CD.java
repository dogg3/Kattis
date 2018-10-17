import java.io.*;
import java.util.*;

class CD {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{
            int antal1 = 0;
            int antal2 = 0;

     
            List<Integer> numbers = new ArrayList<>();
            sc = new Scanner(new FileReader("A.0.in"));
                
                while(sc.hasNext()){
                   
                    numbers.add(sc.nextInt());
                }

                
              antal1 = numbers.get(0);
              antal2 = numbers.get(1);

             


              int i = 2;
              int j = antal1+2;
              int count = 0 ;


            
              


            }



                
             System.out.println(count);
          
        }finally{

            sc.close();

        }

        }
        
    }