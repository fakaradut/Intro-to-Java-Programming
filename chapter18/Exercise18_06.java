
public class Exercise18_06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("m(" + i + ")\t" + m(i));
		}

	}

	public static double m(int i) {
		double sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j / (j + 1.);
		}
		return sum;
	}

}
