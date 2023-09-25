package hw_3;

import java.util.Arrays;
import java.util.Scanner;

public class TopicOne {
	public static void main(String []args) {
		Scanner a = new Scanner(System.in);
		System.out.println("請輸入三個整數");

		int[] Side_length = new int[3];

		Side_length[0] = a.nextInt();
		Side_length[1] = a.nextInt();
		Side_length[2] = a.nextInt();

		Arrays.sort(Side_length);

		int x = Side_length[0], y = Side_length[1], z = Side_length[2];

		if (x > 0 && (x + y) > z) {

			if (x == y && y == z) {
				System.out.println("正");
			} else if (x == y || y == z) {
				System.out.println("等腰");
			} else if (x * x + y * y == z * z) {
				System.out.println("直角三角形");
			} else if (z > y && y > x) {
				System.out.println("其他");
			}
		}

		else {
			System.out.println("不是三角形");
		}
		a.close();
	}
}
