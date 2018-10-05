import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

class Sibice {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
        int totMatches;
        int width;
        int height;
 
        int i = 0;
      

        try{

            sc = new Scanner(new FileReader("2.in"));

            totMatches = sc.nextInt();
            width = sc.nextInt();
            height = sc.nextInt();


            int[] matches = new int[totMatches];

          while(sc.hasNextInt()){
            matches[i] = sc.nextInt();
                i++;

          }

      
        double dia = pyto(width, height);

          for(int match: matches){
            if(dia >= (double) match){
                System.out.println("DA");
            }else{
                 System.out.println("NE");
            }

          }

     
      
       


      



        }finally{

            sc.close();

        }


        }

        public static double pyto(int width, int height){
            int h = height;
            int w = width;

            double tal = (h*h) + (w*w);

            double diagonalen = Math.sqrt(tal);
            return diagonalen;

        }
        
    }