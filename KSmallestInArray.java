package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class KSmallestInArray{
	public int[] kSmallest(int[] array, int k) {
	    if (array.length == 0 || k == 0) { //k = 0 -> npe
	    	return new int[0];
	    }
	    //1. use a maxHeap offer peek poll
	    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {//k >= 1
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1.equals(o2)) {
					return 0;
				}
				// TODO Auto-generated method stub
				return o1 > o2 ? -1 : 1;
			}
	    });
		//2.heapify
	    for (int i = 0; i < k; ++i) {
	    	maxHeap.offer(array[i]);
	    }
	    //3. compare
	    for (int i = k; i < array.length; ++i) {
	    	if (array[i] < maxHeap.peek()) {
	    		maxHeap.poll();
	    		maxHeap.offer(array[i]);
	    	}
	    }
	    //4.store and return
	    int[] result = new int[k];
	    for (int i = k - 1; i >= 0; --i) {
	    	result[i] = maxHeap.poll();
	    }
	    return result;
	}
}