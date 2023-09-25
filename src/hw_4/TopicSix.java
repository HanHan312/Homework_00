package hw_4;

public class TopicSix {
	public static void main(String[] args) {
		int sc = 0;
		int[] student = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int score[][] = { 
				{ 10, 37, 100, 77, 98, 90 }, 
				{ 35, 75, 70, 95, 70, 80 }, 
				{ 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, 
				{ 90, 64, 75, 60, 75, 50 }, 
				{ 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, 
				{ 70, 95, 90, 89, 90, 75 } };
		for (int i = 0; i < score[0].length; i++) {
			sc = 0;
			for (int j = 0; j < student.length; j++) {
				if (sc < score[j][i]) {
					sc = score[j][i];
				}
			}
			for (int j = 0; j < student.length; j++) {
				if (score[j][i] == sc) {
					count[j]++;
				}
			}

		}

		for (int j = 0; j < student.length; j++) {

			System.out.print("同學座號:"+student[j]);
			System.out.print("最高分次數:"+count[j]);
			System.out.println();
		}
	}
}
