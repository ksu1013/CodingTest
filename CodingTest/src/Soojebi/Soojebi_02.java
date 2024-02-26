package Soojebi;

public class Soojebi_02 {

	
	static class Super{
		public Super() {
			// TODO Auto-generated constructor stub
			System.out.println("아빠 클래스 생성자");
			name();
		}
		
		public Super(String name) {
			// TODO Auto-generated constructor stub
			System.out.println(name+" 클래스 생성자");
		}
		
		void name() {
			System.out.println("아빠 클래스 이름입니다.");
		}

		
	}
	
	static class Son extends Super{
		String name ="승욱";
		
//		public Son() {
//			super();
//			System.out.println("아들클래스 생성자");
//		}
		
		void name(){
			System.out.println("아들 클래스 이름입니다.");
		}
	}
	
	public static void main(String[] args) {
		
		Son s =new Son();
		s.name();
		
	}
	

}
