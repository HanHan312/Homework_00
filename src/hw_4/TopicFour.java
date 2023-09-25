package hw_4;

import java.util.Scanner;

public class TopicFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入你想借的金額");
		int lendMoney = sc.nextInt();
		int count = 0;

		int[][] money = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		for (int i = 0; i < money.length; i++) {

			if (money[i][1] >= lendMoney) {
				count += 1;
				System.out.println("能借的員工有:" + money[i][0] + "號");

			}

		}
		System.out.println("總共有:" + count + "人");
		sc.close();
	}
}
