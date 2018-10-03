import java.io.*;
import java.util.Scanner;

class Stones {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{

            sc = new Scanner(new FileReader("2.in"));

            int present1 = sc.nextInt();
            int mean = sc.nextInt();
           	int present2 = -1000;
           	boolean foundIt=false;

      
		while(foundIt==false){
	
			if((present1 + present2)/2==mean){
			
			break;

				}
					present2+=1;
			}

			System.out.println(present2);

        }finally{

            sc.close();

        }

      }
        
 }


  