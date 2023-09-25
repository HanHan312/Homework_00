package hw_3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TopicThird {
	public static boolean check(ArrayList<Integer> numlist,int checknum) {
		for (int i = 0; i < numlist.size(); i++) {
			int num = numlist.get(i);
			if (num == checknum) {
				return false;

			}
		}
		return true;
	}
	
	public static ArrayList<Integer> getnum(int x){
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != x && (i < x * 10 || i > x * 10 + 9)) {
				num.add(i);
			}
		}
		return num;
	}
	public static void main(String []args) {
		Scanner a = new Scanner(System.in);
		System.out.println("請輸入不要的數字1~9");
		int x = a.nextInt();
	
		
		ArrayList<Integer> lotonumlist =getnum(x);
		for(int i=0;i<lotonumlist.size();i++) {
			int lotonum=lotonumlist.get(i);
			System.out.print(lotonum+",");
		}
		System.out.println();
		System.out.println(lotonumlist.size()+"個");
		Random r = new Random();
	
		ArrayList<Integer> indexlist = new ArrayList<>();

		while (indexlist.size() < 6) {
		
			int w = r.nextInt(lotonumlist.size() - 1);

			if (check(indexlist,w)) {
				indexlist.add(w);
			}
		}
		System.out.println();
		for (int e = 0; e < indexlist.size(); e++) {
			int index = indexlist.get(e);
			int y = lotonumlist.get(index);
			System.out.println("電腦選號:"+y);
		}
		a.close();
		
	}

}
