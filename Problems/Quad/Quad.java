import java.io.*;
import java.util.Scanner;

class sample {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{

            sc = new Scanner(new BufferedReader(new FileReader("2.in")));

       
            int x = sc.nextInt();
            int y = sc.nextInt();
      

             if(x>0){
                if(y>0){
                    System.out.println(1);
                }else{
                System.out.println(4);
                }
             }

             if(x<0){
                    if(y>0){
                    System.out.println(2);
                }else{
                System.out.println(3);
                }


             }
       



        

        }finally{

            sc.close();

        }

        }
        
    }