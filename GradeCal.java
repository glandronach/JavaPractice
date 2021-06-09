package practice.kunsan.taewan;

import java.util.Scanner;

public class GradeCal {

	void calcultator() {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		System.out.print("학점 : ");
		if (score > 100) {
			System.out.print("100 이하의 성적을 입력해주세요");
		} else if (score == 100) {
			System.out.print("만점입니다!");
		} else if (score >= 90) {
			System.out.print(" A");
		} else if (score >= 80) {
			System.out.print(" B");
		} else if (score >= 70) {
			System.out.print(" C");
		} else if (score >= 60) {
			System.out.print(" D");
		} else if (score < 60) {
			System.out.print(" B");
		}
	}

	public static void main(String[] args) {
		GradeCal function = new GradeCal();
		
		function.calcultator();
	}
}
