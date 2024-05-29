package com.java.practice40;

public class FrequencyOfEachNo {
 public void frequencyOfEachNo(int a[], int n) {
	 // int visited= -1; used Integer.MIN_VALUE;
	 
	 int []arr= new int[n];
	 
	for(int i=0;i<n;i++) {
		int count=1;// all array elements will appears at least once
		for(int j=i+1;j<n;j++) {
			if(a[i]==a[j]) {
				count++;
				
				//To avoid counting same element again  
                arr[j] = Integer.MIN_VALUE; // INDEX NOT BE NEGATIVE, BUT ELEMENTS CAN BE
			} 
		}
		if(arr[i]!=Integer.MIN_VALUE) {
			arr[i]=count;
			System.out.println("frequency of "+a[i]+" is "+count);
		}
	}
	 
 }
}
