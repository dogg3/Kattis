import java.io.*;
import java.util.*;
import java.util.Scanner;

class Factorial {
    
    static  int counter = 0;
    public static void main(String[] args) throws IOException{



     
      int result = factorial(number);
  
        System.out.println(result);
   
       
        
    }

     static int factorial(int number){
       
        if(number==0){
          return 1;
    
               System.out.println(counter);

        }

          else{
     
            return number * factorial(number-1);

          
          }

      }

  }