package edu.donseo.ksh;

import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.�Է�
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i++){
			System.out.println("����(0~100):");
			score[i] = sc.nextInt();
		}
		
		//2.ó��
		int sum = 0;
		for(int i=0;i<score.length; i++) {
			sum = sum + score[i];
		}
		
		double ave = (double)sum/5;
		
		int max = score[0]; //�ִ밪
		int min = score[0]; //�ּҰ�
	
		for(int i=0;i<score.length;i++) {
			if(max<score[i])
				max = score[i];
			if(min>score[i])
				min = score[i];
		}
		//3.���
		System.out.println("���:" + ave);
		System.out.println("�ִ밪 :"+max);
		System.out.println("�ּҰ� :"+min);
	}

}
