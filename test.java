package sort;

import java.util.Random;
public class test {
    //int chance = 0;
	public int ran(int a, int b) {
		 Random rand = new Random();
	     return rand.nextInt(2);
	}
	
    public static void main(String[] args){
    	test solution = new test();
    	int x = solution.ran(1, 2);
    	System.out.println(x);
    }
}