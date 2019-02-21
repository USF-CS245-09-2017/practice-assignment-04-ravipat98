public class SelectionSort implements SortingAlgorithm
{
	public void sort (int [] a)
	{
		int b = a.length; 
  
        // Each by each we want to move the boundary of the unsorted array 
        for (int i = 0; i < b-1; i++) 
        { 
            // find the minimum element in the unsorted array
            int minimum_index = i; 
            for (int j = i+1; j < b; j++) 
                if (a[j] < a[minimum_index]) 
                    minimum_index = j; 
  
            // switch the found minimum element with the first element
            int temp = a[minimum_index]; 
            a[minimum_index] = a[i]; 
            a[i] = temp; 
        } 
	}
}

