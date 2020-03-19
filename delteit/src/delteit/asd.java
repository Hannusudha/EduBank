package delteit;

public class asd {

	public static void main(String args[]) {

		String str = "che1tan2sharm5";
		int n = 0;
		int sum = 0;

		String str1 = str.replaceAll("[a-z]", "");

		int m = Integer.parseInt(str1);
		System.out.println(m);

		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		System.out.println("Sum of Digits:" + sum);
	}

}