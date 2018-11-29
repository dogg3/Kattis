import java.lang.*;
import java.util.*;
package Algo;
    public class BinarySearch {

    	public static int binarySearch(int[] array, int value, int left, int right){

    		if(right<left){
    			return -1;
    		}
    		 int mid = ((right-left)/2) +left;
    		if (array[mid]== value){
    			return mid;
    		}if(value>array[mid]){
    			return binarySearch(array, value, mid+1, right);
			}
			else{
				return binarySearch(array, value, left, mid-1);
			}

    }

}

