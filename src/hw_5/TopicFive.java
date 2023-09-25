package hw_5;

public class TopicFive {
	public static void getAuthCode() {
		int[] answer = new int[8];
		int r = 0;
		for (int i = 0; i < answer.length; i++) {
			r = (int) (Math.random() * (122 - 48 + 1)) + 48;
			if ((r >= 48 && r <= 57) || (r >= 65 && r <= 90) || (r >= 97 && r <= 122)) {
				answer[i] = r;
				System.out.print((char) r);

			} else {
				i--;
			}
		}
	} 
	public static void main(String[]args) {
		System.out.println("本次產生的隨機號碼為:");
		getAuthCode();
	
	}
}
