package practice.kunsan.taewan;

import java.util.Scanner;

public class MArr {
	void cal() {
		Scanner scan = new Scanner(System.in);

		int[][] data = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };
		int[] sum = new int[5];
		int[] avg = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("ID= " + i+2 + " : ");
			for (int j = 0; j < 3; j++) {
				sum[i] += data[i][j];
				avg[i] = sum[i]/3;
			}
			System.out.println("ÇÕ°è : " + sum[i] + " Æò±Õ : " + avg[i]);
		}
	}

	public static void main(String[] args) {
		MArr function = new MArr();
		function.cal();
	}
}
