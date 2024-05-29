package com.java.practice40;

public class SortInDesc {
      public void sortInDescOrder(int a[], int n) {
    	  for(int i=0;i<n-1;i++) {
    		  for(int j=0;j<n-i-1;j++) { // when i will max, this loop run till +1, i<n-1.
    			  if(a[j]<a[j]+1) {
    				  int temp=a[j];
    				  a[j]=a[j+1]; 
    				  a[j+1]=temp; // temp storing smaller value which should at last index
    			  }
    		  }
    	   }
    	  System.out.print("sorted array elements in desc: ");
    	  for(int i=0;i<n;i++) {
    		  System.out.print(a[i]+" ");
    	  }
    	  System.out.println("\n");
      }
}
