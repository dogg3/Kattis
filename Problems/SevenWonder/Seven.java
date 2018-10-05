import java.io.*;
import java.util.*;
import java.util.Scanner;

class Seven {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;

       String word = null;
      

        try{

            sc = new Scanner(new FileReader("3.in"));


          while(sc.hasNext()){
      
      
                word = sc.next();
                

          }

          int t = 0;
        int g = 0;
        int c = 0;
        int extra = 0;

          for(int i = 0; i<word.length(); i++){
            switch (word.charAt(i)){
                case 'T': t+=1;
                    break;
                case 'G': g+=1;
                    break;
                case 'C': c+=1;
                    break;
                }


          }

        
        for(int i =0; i<20; i++){
          if(t>i && g>i && c>i  ){
            extra += 7;

          }

      }

          t = t*t;
          g =g*g;
          c = c*c;
      

     
      
   System.out.println(t+g+c+extra);

      
           


        }finally{

            sc.close();

        }

        }
        
    }