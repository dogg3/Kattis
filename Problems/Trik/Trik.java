import java.io.*;
import java.util.*;

class Trik {
    
    
    public static void main(String[] args) throws IOException{
    
       Scanner sc = null;

        try{

             sc = new Scanner(new FileReader("1.in"));

        
  
        String string = null;
       
      
        while(sc.hasNext()){

                 string = sc.next();
         
            }

    int ballIsUnder = 1;  
    char c;
     for(int i=0; i<string.length(); i++){
         c = string.charAt(i);
          if(String.valueOf(c).equals("A") ){
         
                if(ballIsUnder ==1){
                    ballIsUnder=2;

                }
                else if(ballIsUnder ==2){
                    ballIsUnder=1;
                }

          }  

          if(String.valueOf(c).equals("B") ){
                if(ballIsUnder ==2){
                    ballIsUnder=3;
                }
                 else if(ballIsUnder ==3){
                    ballIsUnder=2;
                }


          }  


          if(String.valueOf(c).equals("C") ){
                if(ballIsUnder ==1){
                    ballIsUnder=3;
                }
                 else if(ballIsUnder ==3){
                    ballIsUnder=1;
                }
            }

           
     }



  
 System.out.println(ballIsUnder);
        
        

        }finally{

            sc.close();

        }

        }
}
        
    