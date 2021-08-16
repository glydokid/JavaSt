package edu.donseo.ksh;

import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.입력
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i++){
			System.out.println("정수(0~100):");
			score[i] = sc.nextInt();
		}
		
		//2.처리
		int sum = 0;
		for(int i=0;i<score.length; i++) {
			sum = sum + score[i];
		}
		
		double ave = (double)sum/5;
		
		int max = score[0]; //최대값
		int min = score[0]; //최소값
	
		for(int i=0;i<score.length;i++) {
			if(max<score[i])
				max = score[i];
			if(min>score[i])
				min = score[i];
		}
		//3.출력
		System.out.println("평균:" + ave);
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
	}

}
