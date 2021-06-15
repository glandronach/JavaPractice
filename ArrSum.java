package practice.kunsan.taewan;

import java.util.Scanner;

public class ArrSum {
	void cal() {
		Scanner scan = new Scanner(System.in);
		
		int[] arrA = new int[5];
		int[] arrB = new int[5];
		int sumA = 0, sumB = 0;
		
		System.out.print("A : ");
		for(int i= 0; i < 5; i++ ) {
			arrA[i] = scan.nextInt();
			sumA += arrA[i];
		}
		System.out.println("Sum<A> = " + sumA);
		
		System.out.print("B : ");
		for(int i= 0; i < 5; i++ ) {
			arrB[i] = scan.nextInt();
			sumB += arrB[i];
		}
		System.out.println("Sum<A> = " + sumB);
		
	}

	public static void main(String[] args) {
		ArrSum function = new ArrSum();

		function.cal();
	}
}
