package Arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		int average=0;
		int marks[] = new int[n];
		System.out.println("Enter Marks of Students :");
		for(int y=0;y<n;y++) {
			marks[y] = sc.nextInt();
		average += marks[y]; 
		    
		}
		average /=n;
		System.out.println("Average Marks :"+average);
	}

}
