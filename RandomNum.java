package sort;
//genereate a number in [a, b]
import java.util.Random;

public class RandomNum {//the class cannot be named as Random, same with import
	public int random(int a, int b) {
		Random rand = new Random();
		return a + rand.nextInt(b - a + 1);
	}
	
	public static void main(String[] args) {
		int a = 2, b = 8;
		RandomNum solution = new RandomNum();
		System.out.println(solution.random(a, b));
	}
}
