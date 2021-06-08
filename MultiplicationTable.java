package practice.kunsan.taewan;

import java.util.Scanner;

public class MultiplicationTable {

	void gugudan() {
		Scanner scan = new Scanner(System.in);
		int input = 0;

		try {
			input = scan.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(input + " X " + i + " = " + input * i);
			}
		} catch (Exception e) {
			System.out.println("오류입니다.");
			System.out.println("정수만 입력해 주세요.");
		}
	}

	public static void main(String[] args) {
		MultiplicationTable function = new MultiplicationTable();
		function.gugudan();
	}
}
