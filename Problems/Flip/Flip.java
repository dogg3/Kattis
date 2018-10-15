import java.io.*;
import java.util.*;

class Flip {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{

            sc = new Scanner(new FileReader("filip.dummy.1.in"));
     StringBuilder stringBuilder1 = new StringBuilder();
       StringBuilder stringBuilder2 = new StringBuilder();
            int counter = 0;

            while(sc.hasNext()){
            stringBuilder1.append(sc.nextInt());

            if(counter>2){}
              stringBuilder2.append(sc.nextInt());
               
              counter++;
            }
        
            stringBuilder1.reverse();
            stringBuilder2.reverse();

            String one = stringBuilder1.toString();
            String two = stringBuilder2.toString();

            int o = Integer.parseInt(one);
            int t = Integer.parseInt(two);

            int value = Integer.compare(o,t);
        


            int output = o;
            if(value==-1){
                output = t;
            }
            System.out.println(output);
            


        }finally{

            sc.close();

        }

        }
        
    }