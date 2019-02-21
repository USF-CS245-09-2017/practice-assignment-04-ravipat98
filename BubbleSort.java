public class BubbleSort implements SortingAlgorithm 
{
	public void sort(int [] a) 
    { 
        int b = a.length; 
        for (int i = 0; i < b-1; i++) 
            for (int j = 0; j < b-i-1; j++) 
                if (a[j] > a[j+1]) 
                { 
                    // switch a[j+1] and a[i] 
                    int temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp; 
                } 
    } 
}