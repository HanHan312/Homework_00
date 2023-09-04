package hwk_2;

public class EvenSum {
	public static void main(String[]args) {
		int i,sum=0;
		for(i=1;i<=1000;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("1~1000偶數和:"+sum);
		
		
		
		
	}

}
