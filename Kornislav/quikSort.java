import java.util.*;
import java.io.*;

public class quikSort{
	

	public static void main(String[] args) throws IOException{

		int[] array = new int[4];
		int i = 0;
		Scanner sc = null;


		try{

			sc = new Scanner(new FileReader("kornislav.1.in"));



			while(sc.hasNext()){
				array[i] = sc.nextInt();
		
				i++;

			}
		}finally{
			sc.close();
		}
	

















		insertionSort(array, array.length);

		int area = array[0]*array[2];
		System.out.println(area); 

		
	
	



	}









	public static void insertionSort(int[] array, int length){
			int i,j, key;

		for( i =1; i<length; i++){

			key = array[i];
			j = i-1;


			/***
			****If array[0...i-1] is smaller than key(arra[i]) move it to the right one step
			* It overrides the  array[i], but that value is stored in key
			*/

			while(j>=0 && array[j] > key){

				array[j+1] = array[j];

				j = j-1;

			}

				array[j+1]= key;


		}




	}


}