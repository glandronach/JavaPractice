package practice.kunsan.taewan;
import java.util.Scanner;

public class StarMaker {

	void maker() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		try {
			int num = scan.nextInt();
			
			for (int i=1; i<=num; i++) {
				System.out.print("(" + i + ")");
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} catch(Exception e) {
			System.out.println("������ �Է����ּ���.");
		}
	}
	
	public static void main(String[] args) {
		StarMaker function = new StarMaker();
		
		function.maker();
	}
}
