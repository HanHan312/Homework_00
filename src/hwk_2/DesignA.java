package hwk_2;

public class DesignA {
	public static void main(String[]args) {
//		char print_char= 'A';
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(print_char);
//			}
//			int transfer_int = (int)print_char + 1;
//			print_char = (char)transfer_int;
//			System.out.println();
//		}
		
		
	       for(int i=1;i<=6;i++) {
	    	   switch(i) {
	    	   case 1:
	    		   System.out.println("A");
	    		   break;
	    	   case 2:
	    		   System.out.println("BB");
	    		   break;
	    	   case 3:
	    		   System.out.println("CCC");
	    		   break;
	    	   case 4:
	    		   System.out.println("DDDD");
	    		   break;
	    	   case 5:
	    		   System.out.println("EEEEE");
	    		   break;
	    		   default :
	    			   System.out.println("FFFFFF");
	    	   }
	       }
	}
}
