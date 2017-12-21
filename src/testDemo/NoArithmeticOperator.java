package testDemo;
/*
 * 不用算术运算符完成两个数求和
 */
public class NoArithmeticOperator {
	public static int add(int a, int b) {
		if(b==0) {
			return a;
		}
		int c = a^b;
		System.out.println(c);
		int d = (a & b) << 1;
		System.out.println(d);
		return add(c,d);
	}
	public static void main(String[] args) {
		System.out.println(add(124,4567));
	}
}
