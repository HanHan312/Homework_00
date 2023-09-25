package hw_4;

public class TopicOne {
	public static void main(String[] args) {
		int x[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		int answer = sum / x.length;
		System.out.println("平均值" + answer);

		for (int i = 0; i < x.length; i++) {
			if (x[i] > answer) {
				System.out.println("大於平均的元素" + x[i] + "\t");
			}

		}

	}
}
