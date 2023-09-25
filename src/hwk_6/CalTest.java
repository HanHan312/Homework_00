package hwk_6;

import java.util.Scanner;

public class CalTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值");
		String input1 = sc.next();
		System.out.println("請輸入y的值");
		String input2 = sc.next();

		int num1, num2;
		try {
			if (input1.matches("\\d*") && input2.matches("[+-]?\\d*")) {
				num1 = Integer.parseInt(input1);
				num2 = Integer.parseInt(input2);
			} else
				throw new CalException("輸入格式不正確");
			Calculator answer = new Calculator(num1, num2);
			System.out.print(answer.getVolume());

		} catch (CalException c1) {
			System.out.print(c1.getMessage());

		}
		sc.close();
	}
}
