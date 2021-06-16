package practice.kunsan.taewan;

import java.util.*;

public class Arith {
	
	void cal() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번쨰 정수 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		
		int add = num1 + num2;
		int subtract = add - num1;
		int multiply = (num1 + add - subtract) * num2;
		int divide = multiply / num1;
		
		System.out.print("( " + num1 + " + " + add + " - " + subtract + " ) X " + num2 + " / " + num1 + " = " + divide);
	}
	
	public static void main(String[] args) {
		Arith function = new Arith();
		function.cal();
	}

}
