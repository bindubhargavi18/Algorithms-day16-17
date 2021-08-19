package algorithm;

public class BubbleSort {
	public static void main(String[] args) 
	{
		int arr[]= {10,2,4,47};
		bubbleSort(arr);
		System.out.println("Sorted Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void bubbleSort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)  
		{
			for(int j=i+1;j<arr.length;j++)  
			{
				if(arr[j]<arr[i])  
				{
					temp=arr[i];  
					arr[i]=arr[j];  
                	arr[j]=temp;   
				}
			}
		}
	}
}
