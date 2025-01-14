package Soojebi;
class ClassA {
	ClassA() {
		System.out.print('A');
		this.prn();
	}
	void prn() {
		System.out.print('B');
	}
}
class ClassB extends ClassA {
	ClassB() {
		super();
		System.out.print('D');
	}
	void prn() {
		System.out.print('E');
	}
	void prn(int x) {
		System.out.print(x);
	}
}
public class Soojebi_05 {
	public static void main(String[] args) {
		int x = 7;
		ClassB cal = new ClassB();
		cal.prn(x);
	}
}

