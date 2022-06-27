package com.edu.bina;

import java.util.Scanner;

class BinarySearch{
	int arr[], size, key;
	
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		size = sc.nextInt();
		arr=new int[size];
		System.out.println("Enter "+size+" array elements in ascending order");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the search element");
		key = sc.nextInt();
		
	}
	
	public void searchBinary() {
		int l,h,mid=0, pos=-1;
		l=0;
		h=size-1;
		
		while(l<=h) {
			mid = (l+h)/2;
			if(key == arr[mid]) {
				pos = mid;
				break;
			}
			else if(key>arr[mid]) {
				l=mid+1;
			}
			else if(key<arr[mid]) {
				h=mid-1;
			}
		}
		
		if(pos >=0) {
			System.out.println(key+" found at position "+(mid+1));
		}else {
			System.out.println(key+" not found ");
		}
	}
}

public class MainBinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.inputData();
		bs.searchBinary();

	}

}
