package edu.dongseo.ksh;

public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100; //기본타입
		String s = "홍길동"; //참조타입
		
		System.out.println(n);
		System.out.println(s);
		
		int n1 = 100; //n1에 실제 값이 들어감 (100)
		int n2 = 100;
		if(n1==n2)
			System.out.println("두 값이 일치");
		else
			System.out.println("두 값이 불일치");
		
		String s1 = new String ("홍길동"); //s1이라는  곳엔 홍길동의 주소값이 저장(주소값 비교)
		String s2 = new String ("홍길동"); 
		if(s1==s2)
			System.out.println("두 값이 일치");
		else
			System.out.println("두 값이 불일치");
		
		if(s1.equals(s2)) //내용비교
			System.out.println("두 값이 일치");
		else
			System.out.println("두 값이 불일치");
	}
		

}
