package edu.dongseo.ksh;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*//�ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		
		//1.�Է�
		System.out.println("����(1~100):");
		int n = sc.nextInt();
		
		//2.ó��
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		
		
		//3.���
		System.out.printf("1~%d������ ��:%d \n",n,sum);
		
		
		
		
		//while
		//2.ó��
		int sum2 = 0;
		int j = 1;
		while(j<=n) {
			sum2 = sum2+j;
			j++;
		}
		
		//3.���
		System.out.printf("1~%d������ ��:%d \n",n,sum2);
		
		
		
		
		
		//do while ��
		//2. ó��
		int k = 1;
		int sum3 = 0;
		do {
			sum3 = sum3 + k;
			k++;
		}while(k<=n);
		
		//3.���
		System.out.printf("1~%d������ ��:%d \n",n,sum3);
		*/
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1~100):");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= n ;i++) {
			if(i%3==0){
			System.out.println(i);
			sum = sum + i;
			}
		}
		System.out.printf("1~%d������ 3�� ��� ��:%d \n",n,sum);

		
		
	}

}
