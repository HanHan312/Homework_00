package hwk_1;

public class TopicThird {
	public static void main(String[] args) {

		int totalsecs = 256559, day = 24 * 60 * 60, hours = 60 * 60, mins = 60, secs = 60;
		// 剩餘小時
		int lavehours = totalsecs % day;
		// 剩餘分鐘
		int lavemins = lavehours % hours;
		// 剩餘秒鐘
		int lavesecs = lavemins % secs;
		System.out.println("256559秒為:" + (totalsecs / day) + "天" + (lavehours / hours) + "小時" + (lavemins / mins) + "分"
				+ (lavesecs) + "秒");

	}
}
