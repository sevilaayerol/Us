import java.util.Scanner;

public class Us {

	static int power(int base, int exponent) {

		if (exponent == 0)
			return 1;

		else {
			return base * power(base, exponent - 1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Taban degeri giriniz :");
		int base = scan.nextInt();
		System.out.print("Us degeri giriniz :");
		int exponent = scan.nextInt();
		int result = 1;
		System.out.println("Sonuc: " + power(base, exponent));

	}

}
