package edu.dongseo.ksh;

import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner sc = new Scanner(System.in);
		
		//1.점수입력 받기
		System.out.println("점수(0~100):");
		
		int score = Integer.parseInt(sc.nextLine());
		
		//2.학점 계산
		char grade = 'F';
		if(score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade ='B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		//3.학점 출력
		System.out.println("학점: "+ grade);
		
		
		//swich 문
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점: "+ grade);
		
		//switch문 변수를 문자열
		
		String sLine = sc.nextLine();
		
		switch(sLine){
		case"Hello":
			System.out.println("Hello");
			break;
		case"Java":
			System.out.println("Jana");
			break;
		default:
			System.out.println("일치하는 값 없음");
		}
	}

}
