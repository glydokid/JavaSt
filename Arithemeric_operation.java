package edu.doseo.ksh;

import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double aa;
		double bb;
		
		System.out.println("�μ��� �Է��Ͻÿ�");
		
		System.out.print("ù��° �Ǽ�:");
		aa = sc.nextDouble();
		
		System.out.print("�ι�° �Ǽ�:");
		bb = sc.nextDouble();
		
		if (bb <= 0)
		{
			System.out.println("�߸��� �Է��Դϴ�");
		}
		
		System.out.println("--------------------------");
		
		double p = aa+bb;
		double m = aa-bb;
		double n = aa/bb;
		double g = aa*bb;
		System.out.println("���� ���: " + p);
		System.out.println("�E�� ���: " + m);
		System.out.println("������ ���: " + n);
		System.out.println("���� ���: " + g);
		
		
	}
}

