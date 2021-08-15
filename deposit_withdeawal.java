package edu.dongseo.ksh;

import java.util.Scanner;

public class MiddleTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;		//run에 true를 대입.
		  int balance = 0;		
		  Scanner scanner = new Scanner(System.in);		//입력받기 위해 scanner를 선언
		  
		  while(run){		//run = true 반복문 실행
		     System.out.println("1.입금  2.출금  3.잔고  4.종료");
		     System.out.print("선택>");
		     int opcode = scanner.nextInt();		// opcode에 입력
		     
		     switch(opcode) {
		     case 1 : {
		    	 int in = 0;
		    	 System.out.print("입금액 : ");
		    	 in = scanner.nextInt(); //입력
		    	 balance += in;
		    	 break;		//break문으로 실행 종료
		     }
		     case 2 : {
		    	 System.out.print("출금액 : ");
		    	 int out = 0;
		    	 out = scanner.nextInt();
		    	 balance -= out;
		    	 break; 
		     }
		     case 3 : {
		    	 System.out.printf("잔고 : %d\n", balance);
		    	 break;
		     }
		     case 4 : 
		    	 run = false;		// while문을 빠져 나옴
		     }
		 }		 
		  System.out.println("프로그램을 종료합니다.");
		 }    
	

	}


