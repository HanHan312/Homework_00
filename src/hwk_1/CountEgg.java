package hwk_1;

public class CountEgg {
	public static void main(String[]args) {
		int egg=200;
		//計算200顆可以換多少打
		int dozen=egg/12;
		System.out.println("200顆雞蛋總共有:"+dozen+"打");
		//取一打後的餘數
		int remain=egg%12;
		System.out.println("剩下顆數:"+remain);
		
		
		
	}
}
