package hwk_2;

public class TopicFifth {
	public static void main(String[] args) {

		int f = 0;
		// 1~49 符合40以下,剩下4,14,24,34)
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i < 40) {
				System.out.print(i + ",");
				f++;
			}
		}
		System.out.println();
		System.out.println("總共有:" + f + "個");
	}

}
