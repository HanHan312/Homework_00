package hw_5;

public class TopicTwo {
	public static void ranavg() {
		int j = 0;
		for (int i = 0; i <= 9; i++) {
			int x = (int) (Math.random() * 101);
			System.out.print(x + ",");
			j += x;
		}
		int y = j / 10;
		System.out.println("平均值:" + y);
	}

	public static void main(String[] args) {

		ranavg();

	}

}
