/*
 * @author Talha Guzel 041802046
 * @since 07.12.2020
 * Compare the time complexity of three priority queue implementations.
 * */
import java.util.ArrayList;
import java.util.PriorityQueue;

public class main {
	
	
	public static void main(String[] args) {
		int N = 100000; 
	ArrayList<Integer> randomNumbers = new ArrayList<>();
	for(int i=0;i<N;i++) {
		randomNumbers.add((int) (Math.random()*N));
	}
	
	long ArayPriorityTime = ArrayPriority(randomNumbers);
long MyPriorityQueueTime = heapPriority(randomNumbers);
	long JavaPriorityQueueTime = JavasPriority(randomNumbers);			
	System.out.println("N        MyPriorityQueue    ArrayPriorityQueue ");
	System.out.println("N= " + N + "  " + (double)MyPriorityQueueTime/(double)JavaPriorityQueueTime + "  " + (double)ArayPriorityTime/(double)JavaPriorityQueueTime);
	}
	public static long ArrayPriority(ArrayList<Integer> Numbers) {
		//records the clock as nano before starting 
		long ArrayList1 = System.nanoTime();
		// create priority arraylist
		PriorityQueueArrayList<Integer> ArrayPriority= new PriorityQueueArrayList<>();
		// enqueue random numbers into
		for(int i=0 ;i<Numbers.size();i++) {
			ArrayPriority.enqueue(Numbers.get(i));
		}
		//enqueue the numbers 
		for(int i=0 ;i<Numbers.size();i++) {
			ArrayPriority.dequeue();
		}
		//after finishing  record the clock
		long ArrayList2 = System.nanoTime();
		//take it out from each other and find the time in between
		return (ArrayList2-ArrayList1);
	}
	
	public static long heapPriority(ArrayList<Integer> Numbers) {
		long heappriority = System.nanoTime();
		//Including the exact same order, only the type changes
		MyPriorityQueue<Integer> MyPriority= new MyPriorityQueue<>();
		for(int i=0 ;i<Numbers.size();i++) {
			MyPriority.enqueue(Numbers.get(i));
		}
		for(int i=0 ;i<Numbers.size();i++) {
			MyPriority.dequeue();
		}
		long heappriority2 = System.nanoTime();
		
		
		return (heappriority2-heappriority);
	}
	
	
	public static long JavasPriority(ArrayList<Integer> Numbers) {
		long javapriority = System.nanoTime();
		
		PriorityQueue<Integer> Java = new PriorityQueue<>();
		for(int i=0 ;i<Numbers.size();i++) {
			Java.add(Numbers.get(i));
		}
		for(int i=0 ;i<Numbers.size();i++) {
			Java.remove();
		}
		long javapriority2 = System.nanoTime();
		
		return (javapriority2-javapriority);
	}
}
