package Alogrithms;

import java.util.Scanner;

public class SelectionSortInfo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of elemts of Array : 	"); 
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the elements \b ");
		for(int i =0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++) {
			int minInd = i;
			for(int j = i;j<a.length;j++) {
				if(a[j]< a[minInd]) {
					minInd=j;
				}
			}int temp = a[i];
			a[i] = a[minInd];
			a[minInd]=temp;
		}System.out.println("Sorted Array : ");
		for(int items : a) {
			System.out.print(items+"	");
		}
			

	}

}
