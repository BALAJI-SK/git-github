package Alogrithms;

import java.util.Scanner;

public class BubbleSortinfo {

	public static void main(String[] args) {
		int temp;
		int a[] = new int[5];
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the elements ");
		for(int i =0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j+1]<a[j]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println("Sorted Array :");
		for(int item : a) {
			System.out.print(item +"	");
		}
	}

}
