package practice.kunsan.taewan;

import java.util.Scanner;

public class ArrAvg {

	void cal() {
		Scanner scan = new Scanner(System.in);
		double sum= 0, avg = 0;

		System.out.print("�л� ���� �� �� �ΰ���? : ");
		try {
			int student = scan.nextInt();

			double[] data = new double[student];

			for (int i = 0; i < student; i++) {
				System.out.print(i + 1 + "�� ° �л��� ���� : ");
				data[i] = scan.nextDouble();
			}

			for(int j = 0; j < student; j++) {
				sum += data[j];
			}
			avg = sum/student;
			
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
		} catch (Exception e) {
			System.out.print("�ùٸ� ���ڸ� �ۼ����ּ���");
		}
	}

	public static void main(String[] args) {
		ArrAvg function = new ArrAvg();

		function.cal();
	}
}
