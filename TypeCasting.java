
public class TypeCasting {

	public static void main(String[] args) {

		System.out.println("==========자동형변환=================");
		int i1 = 56;
		long l1 = i1;
		double d1 = l1;
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(d1);

		/* 강제 형변환 */
		double avgd = 89.34;
		// int avgi = avgd;
		// Type mismatch: cannot convert from double to int
		int avgi = (int) avgd;
		// double형의 avgd 를 int 형의 avgi 형으로 변환
		// 할 수 있다 대신 값에 소실이 일어남 ㅇㅇ
		System.out.println(avgd);
		System.out.println(avgi);

		char cc = '힣';
		System.out.println("char cc :" + cc);
		int ci = cc;
		System.out.println("char ci :" + ci);
		char cc2 = (char) ci;
		System.out.println("char cc2 :" + cc2);
		System.out.println("int -->char :" + (char) 4400);
		
		/*
		 * 연삭식 형변환
		 * -연산형들 중 가장 큰 타입으로 모든항이 자동으로 
		 * 형변환 된다.
		 */

		int ii=100;
		long ll=23241;
		double dd = 3.14159;
		
		double result = ii+ll+dd;
		System.out.println("double result:"+result);
		
		double dresult_1 = 1.0/2;
		System.out.println("drsuelt_1:"+dresult_1);
		double dresult_2= 1/2;
		System.out.println("drsuelt_2:"+dresult_2);
		
	}
}