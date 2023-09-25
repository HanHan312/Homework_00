package hwk_6;

public class Calculator {
	private int x;

	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {
		setter(x, y);
	}

	public void setter(int x, int y) throws CalException {
		if (x > 0 && y > 0) {
			this.x = x;
			this.y = y;
		} else if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		}

	}

	public int getVolume() {
		return (int) Math.pow(x, y);
	}

}
