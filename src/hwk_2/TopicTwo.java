package hwk_2;

public class TopicTwo {
	public static void main(String[] args) {
		// 1~10連乘積for
		int j = 1;
		for (int i = 1; i <= 10; i++) {

			j *= i;
		}
		System.out.println(j);

		// 1~10連乘積while

		int i = 1, p = 1;
		while (i <= 10) {
			p *= i;
			i++;
		}
		System.out.println(p);

	}

}
