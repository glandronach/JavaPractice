package practice.kunsan.taewan;

import java.util.Scanner;

public class Str {

	void change() {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String output = "";

		System.out.print("문자열을 입력하세요 : ");
		input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {

			int asci = (int) input.charAt(i);

			if (65 <= asci && asci <= 90) {
				output += (char) (asci + 32);
			} else if (97 <= asci && asci <= 122) {
				output += (char) (asci - 32);
			} else {
				output += (char)asci;
			}
		}
		
		System.out.print("변환된 문자열 : " + output);
	}

	public static void main(String[] args) {
		Str function = new Str();
		function.change();
	}
}
