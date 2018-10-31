import java.io.*;
import java.util.*;

class Moose {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{
            int first = 0;
            int second = 0;
            sc = new Scanner(new FileReader("1.in"));
                while(sc.hasNext()){
                    first = sc.nextInt();
                    second = sc.nextInt();
                }
                 int result = 0;

            if(first==0 && second==0){
                System.out.println("Not a moose");
            }
            else if(first == second){
                result = first+second;
                System.out.println("Even "+ result);
            } else{
                if(first>second){
                    result = first*2;
                }else{
                       result = second*2;
                }
                System.out.println("Odd " + result);
            }

          
        }finally{

            sc.close();

        }

        }
        
    }