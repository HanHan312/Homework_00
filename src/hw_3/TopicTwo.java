package hw_3;

import java.util.Scanner;

public class TopicTwo {
	public static int random() {
		return (int) (Math.random() * 101);

	}

	public static void main(String[] args) {
		int Answer = random();

		Scanner a = new Scanner(System.in);
		int Usernum;
		int max = 100;
		int min = 0;

		while (true) {
			System.out.println("請輸入數字," + min + "~" + max);
			Usernum = a.nextInt();

			if (Usernum < min || Usernum > max) {
				System.out.println("請輸入合理區間的數字!");
				continue;
			}

			if (Usernum > Answer) {
				max = Usernum;
			} else if (Usernum < Answer) {
				min = Usernum;
			} else {
				System.out.println("答對囉!");
				break;
			}
			
		}
		a.close();
	}

}

