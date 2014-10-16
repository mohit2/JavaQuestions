package com.crompsys.sorting_algos;

class MergeSort{
	
public static int[] sort(int[] arr , int n ) {
	System.out.println("sortrd");
	 int[] b=new int [n+1];
	 for(int i=0;i<arr.length;i++){
		 b[arr[i]]++;
	}
	 
	 System.out.println("hello");
	 for (int i=0;i<n+1;i++)
	 {
		 while(b[i]>0){
			 System.out.println(i);
			 b[i]--;
		 }
	 }
	return b;
}	
}
public class MergeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,2,2,2,3,6,8,5,3,8,50,1,2,4,5,7,22,3,4,55,3,21,23,43,46,27};
		MergeSort.sort(arr, 56);
	}

}
