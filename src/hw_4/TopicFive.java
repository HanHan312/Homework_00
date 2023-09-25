package hw_4;

import java.util.Scanner;

public class TopicFive {
	public static void main(String[] args) {
		Scanner use = new Scanner(System.in);
		System.out.println("請輸入年份");
		int year = use.nextInt();
		System.out.println("請輸入月份");
		int month = use.nextInt();
		System.out.println("請輸入日期");
		int day = use.nextInt();
		int answer = 0;
		boolean count=true ;
		int monthDay[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < monthDay.length - 1; i++) {

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				monthDay[1]++;
				System.out.print("閏年");
			} else if (month < 1 || month > 12) {
				System.out.print("請重新輸入");
				count = false;
			} else if (day < 1 || day > monthDay[month - 1]) {
				System.out.print("請重新輸入");
				count = false;
				break;
			}
		}
		if (count == true) {
			for (int i = 1; i < month; i++) {
				answer += monthDay[month - i - 1];
			}
			System.out.print("輸入日期為該年第" + (answer += day) + "天");
		}
		use.close();
	}
}
