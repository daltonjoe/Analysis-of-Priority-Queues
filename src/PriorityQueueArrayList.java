/*
 * @author Talha Guzel 041802046
 * @since 07.12.2020
 * Compare the time complexity of three priority queue implementations.
 * */
import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueArrayList<E extends Comparable<E>> {
	private ArrayList<E> Array ;
	// constructor  
	PriorityQueueArrayList(){
		Array = new ArrayList<>();
		
	}
	public void enqueue(E newObject) {
		Array.add(newObject); 
        int currentIndex = Array.size() - 1; 
    //continues until currentIndex is positive       
        
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
         
            if (Array.get(currentIndex).compareTo(Array.get(parentIndex)) > 0) {
                E temp = Array.get(currentIndex);
                Array.set(currentIndex, Array.get(parentIndex));
                Array.set(parentIndex, temp);
            }
            else
                break; 

            currentIndex = parentIndex;
        }
    
    }
	//extract the last element of the array from the array
	public int dequeue() {
		return (int) Array.remove(Array.size()-1);
		
	}

}
