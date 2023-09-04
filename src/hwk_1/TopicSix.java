package hwk_1;

public class TopicSix {
	public static void main(String[] args) {
		System.out.println(5 + 5);
		// 預設值為int,所以相加為10
		System.out.println(5 + '5');
		// 第一個數值為預設int型別,第二數值為字元,依Unicode編碼char5轉換為int=53,再加上原本int5=58
		System.out.println(5 + "5");
		// 第一個數值為int型別5,第二個數值為字串"5",整數+字串故得55
	}

}
