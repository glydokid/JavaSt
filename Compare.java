package edu.dongseo.ksh;

public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100; //�⺻Ÿ��
		String s = "ȫ�浿"; //����Ÿ��
		
		System.out.println(n);
		System.out.println(s);
		
		int n1 = 100; //n1�� ���� ���� �� (100)
		int n2 = 100;
		if(n1==n2)
			System.out.println("�� ���� ��ġ");
		else
			System.out.println("�� ���� ����ġ");
		
		String s1 = new String ("ȫ�浿"); //s1�̶��  ���� ȫ�浿�� �ּҰ��� ����(�ּҰ� ��)
		String s2 = new String ("ȫ�浿"); 
		if(s1==s2)
			System.out.println("�� ���� ��ġ");
		else
			System.out.println("�� ���� ����ġ");
		
		if(s1.equals(s2)) //�����
			System.out.println("�� ���� ��ġ");
		else
			System.out.println("�� ���� ����ġ");
	}
		

}
