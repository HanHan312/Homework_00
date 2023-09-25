package hw_4;

public class TopicThird {
	public static int answer(String x) {
		char[] myChar = x.toCharArray();
		char[] check = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		for (int i = 0; i < myChar.length; i++) {
			for (int j = 0; j < check.length; j++) {
				if (myChar[i] == check[j]) {
					count++;

				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int total = 0;
		for (int i = 0; i < planet.length; i++) {
			total = total + answer(planet[i]);
		}
		System.out.print(total);
	}
}
