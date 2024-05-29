package com.java.practice40;

public class SortInAscending {
    // java.util inbuilt method Arrays.sort(arr)
	
	// solving using bubbleSort(compare and swap).
	
	public void arraySorting(int[]a,int n) {
		//int temp1=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) { // for each value of i
	            // why j<n-i, after each iteration one greatest(in remaining after first iteration) 
				//element  will set at n-i-1 index(last index)
				if(a[j-1]>a[j]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					
				}
			}
		}
		System.out.print("sorted array elements in asc: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			//temp1=a[n-2]; 
		}
		//System.out.print(temp1); 2nd largest, another way but using sorting easy
		System.out.println("\n");
	}
}
