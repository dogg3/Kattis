import java.util.*;

public class ArrayQueue {



	private int [] a;
	private int count = 0;
	public ArrayQueue(int size){
		a = new int[size];
	}

	public void enqueue(int elt){
		a[count++] = elt;

	}

	public int dequeue(){
			int value = a[0];
			int i = 1;

			while(i<count){
				a[i-1] = a[i];
				i++;
			}
			count--;
			return value;

	}

	public void display(){

		for(int i = count-1; i>=0; --i){
		System.out.println(a[i]);	
	}
	}

	public static void main(String[] args){

		ArrayQueue queue = new ArrayQueue(10);
		queue.enqueue(2);
		queue.enqueue(5);
		queue.enqueue(1);
		queue.enqueue(23);
		queue.enqueue(4);

		

		queue.display();



	}

}