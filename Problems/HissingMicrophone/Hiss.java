	  import java.io.*;
  import java.util.*;

  public class Hiss {
      
      
      public static void main(String[] args) throws IOException{
      
         Scanner sc = null;

          try{

               sc = new Scanner(new FileReader("hissingmicrophone-01.in"));

          
    
               String s = null;
         

          while(sc.hasNext()){
          	s = sc.next();

              			
                 }
int scount = 0;
boolean ex = false;
String ss = "s";
char hej = ss.charAt(0);
                 for(int i=0; i<s.length();i++){
                 	

                 	if(scount==1){
                 		if(s.charAt(i)== hej){ ex = true;}
                 			else {scount=0;}
                 		}
                 	else{
                 		scount = 0;

                 	}

                 	if(s.charAt(i)== hej) {scount++;}

                 }
           
          	if(ex) {System.out.println("hiss");}
          	else {System.out.println("no hiss");}

        


             




     
      } finally{
        sc.close();
      }
  }
  }
          
      