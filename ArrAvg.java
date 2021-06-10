package practice.kunsan.taewan;

import java.util.Scanner;

public class ArrAvg {

	void cal() {
		Scanner scan = new Scanner(System.in);
		double sum= 0, avg = 0;

		System.out.print("학생 수는 몇 명 인가요? : ");
		try {
			int student = scan.nextInt();

			double[] data = new double[student];

			for (int i = 0; i < student; i++) {
				System.out.print(i + 1 + "번 째 학생의 점수 : ");
				data[i] = scan.nextDouble();
			}

			for(int j = 0; j < student; j++) {
				sum += data[j];
			}
			avg = sum/student;
			
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		} catch (Exception e) {
			System.out.print("올바른 숫자를 작성해주세요");
		}
	}

	public static void main(String[] args) {
		ArrAvg function = new ArrAvg();

		function.cal();
	}
}
