package hw_5;

import java.util.Scanner;



public class TopicOne {
	public static void print(int weight,int hight) {
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < weight; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		Scanner answer = new Scanner(System.in);
		System.out.println("請輸入寬高");

		int weight = answer.nextInt();
		int hight = answer.nextInt();
		print(weight,hight);
		answer.close();

	}
}
