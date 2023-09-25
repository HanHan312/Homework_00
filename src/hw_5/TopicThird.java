package hw_5;

public class TopicThird {
	public  int maxElement(int [][] array) {
		int x=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(x<array[i][j]) {
					x=array[i][j];
				}
			}
		}
		return x;
	}
	
	public  double  maxElement(double [][] array) {
		double x=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(x<array[i][j]) {
					x=array[i][j];
				}
			}
		}
		return x;
	}
	
	public static void main(String[]args) {
		int [][]intArray= {
				{1,6,3},{9,5,2}
		};
		
	
		double [][]doubleArray= {
				{1.2,3.5,2.2},{7.4,2.1,8.2}
		};
		
		TopicThird t3=new TopicThird();
		System.out.println(t3.maxElement(intArray));
		System.out.println(t3.maxElement(doubleArray));
	}
}
