package edu.doseo.ksh;

import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double aa;
		double bb;
		
		System.out.println("두수를 입력하시오");
		
		System.out.print("첫번째 실수:");
		aa = sc.nextDouble();
		
		System.out.print("두번째 실수:");
		bb = sc.nextDouble();
		
		if (bb <= 0)
		{
			System.out.println("잘못된 입력입니다");
		}
		
		System.out.println("--------------------------");
		
		double p = aa+bb;
		double m = aa-bb;
		double n = aa/bb;
		double g = aa*bb;
		System.out.println("덧셈 결과: " + p);
		System.out.println("뺼셈 결과: " + m);
		System.out.println("나눗셈 결과: " + n);
		System.out.println("곱셈 결과: " + g);
		
		
	}
}

