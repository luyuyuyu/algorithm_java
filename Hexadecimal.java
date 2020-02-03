package bit;
//16���ƣ� Hexadecimal, 0x
//10 as A, 11 as B, 12 as C.... 15 as F
//16 = 2 ^ 4, so 4 bit = 1 hex
//���������4λ��16���Ƶ�һλ
//how to get the first 4 bits? >> & 0xF (15 = 1111)
class Hexadecimal {
	public String hex(int number) {
		String prefix = "0x";
		if (number == 0) return prefix + "0";
		StringBuilder result = new StringBuilder(); 
		while (number > 0) {
			int cur = number % 16;
			if (cur < 10) result.append((char) ('0' + cur));//result.append(cur);if cur > 10, need to use letter abcdef to represent
			else {
				result.append((char) ('A' + (cur - 10)));
			}
			number >>= 4;
		}
		return prefix + result.reverse().toString();
	    // Write your solution here
	}
	
	public static void main(String[] args) {
		int number = 15;
		Hexadecimal solution = new Hexadecimal();
		System.out.println(solution.hex(number));
	}
}