

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Tri {
    
    
    public static void main(String[] args) throws IOException{
       Scanner sc = null;
       int[] numbers = new int[3];
      

        try{

            sc = new Scanner(new FileReader("tri-01.in"));

            int i = 0;
          while(sc.hasNext()){
      
      
                numbers[i] = sc.nextInt();
                i++;
                

          }


 
     
    	
    	if(numbers[0]+numbers[1]==numbers[2]) System.out.println(numbers[0]+"+"+numbers[1]+"="+numbers[2]);
    	else if(numbers[0]-numbers[1]==numbers[2]) System.out.println(numbers[0]+"-"+numbers[1]+"="+numbers[2]);
    	else if(numbers[0]/numbers[1]==numbers[2]) System.out.println(numbers[0]+"/"+numbers[1]+"="+numbers[2]);
    	else if(numbers[0]*numbers[1]==numbers[2]) System.out.println(numbers[0]+"*"+numbers[1]+"="+numbers[2]);

    	else if(numbers[0]==numbers[1]+numbers[2]) System.out.println(numbers[0]+"="+numbers[1]+"+"+numbers[2]);
    	else if(numbers[0]==numbers[1]-numbers[2]) System.out.println(numbers[0]+"="+numbers[1]+"-"+numbers[2]);
    	else if(numbers[0]==numbers[1]/numbers[2]) System.out.println(numbers[0]+"="+numbers[1]+"/"+numbers[2]);
    	else if(numbers[0]==numbers[1]*numbers[2]) System.out.println(numbers[0]+"="+numbers[1]+"*"+numbers[2]);






     
      
   
      
           


        }finally{

            sc.close();

        }

        }
        
    }