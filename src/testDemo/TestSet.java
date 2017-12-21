package testDemo;

import entity.TestVO;

public class TestSet {
	String str = null;
	public void setStr() {
		str = "I am good";
		TestVO test = new TestVO();
		test.setWord(str);
		System.out.println(test.getWord());
		str = "Hello world";
		System.out.println(test.getWord());
	}
	public static void main(String[] args) {
		TestSet tset = new TestSet();
		tset.setStr();
	}
}
