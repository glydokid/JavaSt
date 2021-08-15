package edu.dongseo.ksh;

import java.util.Scanner;

public class MiddleTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);	//값을 입력 받기위해 scanner을 선언해준다.
		
		int num1;
		int num2;
		
		System.out.print("사용할 연산자를 정하시오 : "); 
		String A = scanner.next();	//연산기호를 입력 받는다.	
		
		System.out.print("첫 번째 수를 입력하시오 : ");
		num1 = scanner.nextInt();	//첫번째 수를 입력 받는다.
	
		System.out.print("두 번째 수를 입력하시오 : ");
		num2 = scanner.nextInt();	//두번째 수를 입력 받는다.
		
		switch(A)		
		{
		case "+" :
			System.out.printf("결과 : %d", num1+num2 ); //덧셈
			break;		
		case "-" :
			System.out.printf("결과 : %d", num1-num2 ); //뺼셈
			break;
		case "*" :
			System.out.printf("결과 : %d", num1*num2 ); //곱셈
			break;
		case "/" :
			System.out.printf("결과 : %d", num1/num2 ); //나눗셈
			break;
		case "%" :
			System.out.printf("결과 : %d", num1%num2 ); //나머지
			break; //break문을 사용하지 않으면 계속 실행 되기때문에 사용해야한다.
		}

	}

}
