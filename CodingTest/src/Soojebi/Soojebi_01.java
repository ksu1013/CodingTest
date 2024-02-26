package Soojebi;

public class Soojebi_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0 ,sum=0;
		System.out.println("i1>>>>"+i);
		while(i<10) {
			i++;
			System.out.println("i>>>>"+i);
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
	}

}
