import java.io.*;
import java.util.Scanner;

class Faktor {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{

            sc = new Scanner(new FileReader("faktor.dummy.1.in"));

            float plannedToPublish = (float)sc.nextInt();
            float impactFactorRequired = (float) sc.nextInt()-1;
            float impactFactor = 0;

            float citations = 1;
            boolean foundIt = false;
            
      
            while(foundIt==false){
                impactFactor = (citations/plannedToPublish);
                if(impactFactor>impactFactorRequired){


                
                    System.out.println( (int) citations);
                       
                    break;

                }

                citations++;

            }


        }finally{

            sc.close();

        }

        }
        
    }