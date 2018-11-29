import java.util.*;

public class DoubleArrayLength{



	public static void main(String[] args){
		int[] source = {1,2,3,4,5};


		int[] destination = new int[2*(source.length)];


		for(int i=0; i<source.length; i++){
			destination[i] = source[i];
		}

		for(int i=0; i<destination.length; i++){	
		System.out.println("The value of destination array is " + destination[i] + "\n");
		}



	}
}