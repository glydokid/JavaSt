package edu.dongseo.ksh;

import java.util.Scanner;

public class MiddleTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;		//run�� true�� ����.
		  int balance = 0;		
		  Scanner scanner = new Scanner(System.in);		//�Է¹ޱ� ���� scanner�� ����
		  
		  while(run){		//run = true �ݺ��� ����
		     System.out.println("1.�Ա�  2.���  3.�ܰ�  4.����");
		     System.out.print("����>");
		     int opcode = scanner.nextInt();		// opcode�� �Է�
		     
		     switch(opcode) {
		     case 1 : {
		    	 int in = 0;
		    	 System.out.print("�Աݾ� : ");
		    	 in = scanner.nextInt(); //�Է�
		    	 balance += in;
		    	 break;		//break������ ���� ����
		     }
		     case 2 : {
		    	 System.out.print("��ݾ� : ");
		    	 int out = 0;
		    	 out = scanner.nextInt();
		    	 balance -= out;
		    	 break; 
		     }
		     case 3 : {
		    	 System.out.printf("�ܰ� : %d\n", balance);
		    	 break;
		     }
		     case 4 : 
		    	 run = false;		// while���� ���� ����
		     }
		 }		 
		  System.out.println("���α׷��� �����մϴ�.");
		 }    
	

	}


