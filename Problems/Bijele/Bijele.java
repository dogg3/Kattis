import java.io.*;
import java.util.*;
import java.util.Scanner;

class Bijele {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{

            sc = new Scanner(new FileReader("2.in"));

          int[] array = new int[6];

          while(sc.hasNextInt()){

                for (int i=0; i<array.length;i++ ) {
                    array[i] = sc.nextInt();

                }

          }


        System.out.println(1-array[0]+" "+ (1- array[1])+" "+(2-array[2])+" "+(2-array[3])+" "+(2-array[4])+" "+(8-array[5]));
      

      
    


      
           


        }finally{

            sc.close();

        }

        }
        
    }