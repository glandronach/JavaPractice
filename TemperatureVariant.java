package practice.kunsan.taewan;

import java.util.Scanner;

public class TemperatureVariant {

	double calculator(double temp) {
		
		return temp*9/5 + 32;
	}
	
	void error() {
		System.out.println("�����Դϴ�.");
	}

	void log() {
		double temp = 0;

		TemperatureVariant function = new TemperatureVariant();
		Scanner scan = new Scanner(System.in);

		System.out.print("���� : ");
		try {
		temp = scan.nextDouble();
		System.out.println("ȭ�� : " + function.calculator(temp));
		} catch(Exception e) {
			function.error();
		}
	}

	public static void main(String[] args) {

		TemperatureVariant function = new TemperatureVariant();
		function.log();

	}

}
