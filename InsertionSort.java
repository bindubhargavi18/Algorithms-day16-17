package algorithm;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] array= {10,4,3,6,8};
		insertionSort(array);
		printArray(array);
	}
	public static void insertionSort(int array[]) 
	{  
      
        for (int i=1;i<array.length;i++) 
        {  
            int temp=array[i];  
            int j=i-1;  
            while(j>=0&&temp<=array[j]) 
            {  
                array[j+1]=array[j];  
                j--;  
            }  
            array[j+1]=temp;
        }
	}
	public static void printArray(int arr[])
    {
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
