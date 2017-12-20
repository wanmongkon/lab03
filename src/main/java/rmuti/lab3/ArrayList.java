package rmuti.lab3;

import java.util.Arrays;

public class ArrayList {
	private Object[] elementData = new Object[1];
	private int size = 0;
	
	public void add(int i, Object e) {
    ensureCapacity(size + 1);
    for(int j=size-1; j>=i; j--) {
    	elementData[j+1] = elementData[j];
    }    
    elementData[i] = e;
    size++;
	}
    private void ensureCapacity(int capacity) {
    	if (capacity > elementData.length) {
    		int s = 2*elementData.length;
    		Object[] arr = new Object[s];
    		for (int i = 0; i < size; i++) {
    			arr[i] = elementData[i];
    		}
    		elementData = arr;
    	}
    }
    @Override
    public String toString() {
    	return Arrays.toString(elementData);
    }
}
    