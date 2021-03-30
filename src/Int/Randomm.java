package Int;

import java.util.Random;

public class Randomm {

	public static void main(String[] args) {
		int range=1000;
		Random r=new Random();
		int rnum = r.nextInt(range);
		System.out.println(rnum);
	}
}
