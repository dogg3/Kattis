import java.util.*;

public class InsertionSort{
	private static int[] testArray = {2,3,61,23,5,41,2,23,4,5};

	public static void main(String[] args){

	

		insertionSort(testArray, testArray.length);
	
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


		System.out.println(Arrays.toString(array));

	}


}