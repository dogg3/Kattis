import java.io.*;
import java.util.*;


class Fizz {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{
		int x = 0;
		int y = 0;
		int n = 0;

		int[] intArr = new int[3];

            sc = new Scanner(new FileReader("fizzbuzz-01.in"));
                int count = 0;
                while(sc.hasNext()){
                   
                    intArr[count] = sc.nextInt();
                	count++;
		}
            

              x = intArr[0];

              y = intArr[1];
              n = intArr[2];


	for(int i = 1; i<n+1; i++){
	String output= Integer.toString(i);
		
		if((i%x==0 && i%y==0)){
 			output="FizzBuzz";
		}
		

		else if(i%x==0){
		output="Fizz";

		} else if(i%y==0){
		output="Buzz";
		}
		
	
	System.out.println(output);
	
	}
	
          
        }finally{

            sc.close();

 
    }
  }


}
