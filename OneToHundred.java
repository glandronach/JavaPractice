package practice.kunsan.taewan;

public class OneToHundred {

	int calculator(int sum) {
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		return sum;
	}

	void log() {
		OneToHundred function = new OneToHundred();
		int sum = 0;
		System.out.println("1부터 100까지의 합 : " + function.calculator(sum));
	}

	public static void main(String[] args) {
		OneToHundred function = new OneToHundred();
		function.log();
	}

}
