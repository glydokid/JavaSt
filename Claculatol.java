package edu.dongseo.ksh;

import java.util.Scanner;

public class MiddleTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);	//���� �Է� �ޱ����� scanner�� �������ش�.
		
		int num1;
		int num2;
		
		System.out.print("����� �����ڸ� ���Ͻÿ� : "); 
		String A = scanner.next();	//�����ȣ�� �Է� �޴´�.	
		
		System.out.print("ù ��° ���� �Է��Ͻÿ� : ");
		num1 = scanner.nextInt();	//ù��° ���� �Է� �޴´�.
	
		System.out.print("�� ��° ���� �Է��Ͻÿ� : ");
		num2 = scanner.nextInt();	//�ι�° ���� �Է� �޴´�.
		
		switch(A)		
		{
		case "+" :
			System.out.printf("��� : %d", num1+num2 ); //����
			break;		
		case "-" :
			System.out.printf("��� : %d", num1-num2 ); //�E��
			break;
		case "*" :
			System.out.printf("��� : %d", num1*num2 ); //����
			break;
		case "/" :
			System.out.printf("��� : %d", num1/num2 ); //������
			break;
		case "%" :
			System.out.printf("��� : %d", num1%num2 ); //������
			break; //break���� ������� ������ ��� ���� �Ǳ⶧���� ����ؾ��Ѵ�.
		}

	}

}
