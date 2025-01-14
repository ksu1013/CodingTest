package Soojebi;

public class Soojebi_03 {

	
//	static class Super{
//		public Super() {
//			// TODO Auto-generated constructor stub
//			System.out.println("아빠 클래스 생성자");
//			name();
//		}
//		
//		public Super(String name) {
//			// TODO Auto-generated constructor stub
//			System.out.println(name+" 클래스 생성자");
//		}
//		
//		void name() {
//			System.out.println("아빠 클래스 이름입니다.");
//		}
//
//		
//	}
//	
//	static class Son extends Super{
//		String name ="승욱";
//		
////		public Son() {
////			super();
////			System.out.println("아들클래스 생성자");
////		}
//		
//		void name(){
//			System.out.println("아들 클래스 이름입니다.");
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		Son s =new Son();
//		s.name();
//		
//	}
	public static void main(String[] args) {
		boolean keyBoolean = true;
		char[] charkeyword = "버튼다운 카라 옥스포드 셔츠".toCharArray();
		for (int i = 0; i < charkeyword.length; i++) {
			int ck = (int) charkeyword[i];
			if ((ck >= 12593 && ck <= 12622) || (ck >= 12623 && ck <= 12643)) {
				keyBoolean = false;
			}
		}
		System.out.println(keyBoolean);
	}
		
	

}
