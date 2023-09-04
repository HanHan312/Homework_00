package hwk_1;

public class CountDay {
	public static void main(String[]args) {
		int total=256559,hour=24,mins=60,secs=60;
		int dayseconds=hour*mins*secs;//一天幾秒鐘
		int hoursseconds=mins*secs;//一小時幾秒鐘
		int lavehours=total%dayseconds;//剩餘小時
		int lavemins=lavehours%hoursseconds;//剩餘分鐘
		int lavesecs=lavemins%secs;//剩餘秒鐘
		 
		System.out.println("256559秒為"+(total/dayseconds)+"天"+(lavehours/hoursseconds)+"小時"+(lavemins/secs)+"分"+lavesecs+"秒");

		
		
	}
}
