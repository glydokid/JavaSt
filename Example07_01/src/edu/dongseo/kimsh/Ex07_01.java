package edu.dongseo.kimsh;

public class Ex07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarA carA = new CarA("CompanyA", "ModelA", "Red", 200);
		
		carA.speedUp();
		System.out.println(carA.getSpeed());
		
		carA.speedUp();
		System.out.println(carA.getSpeed());
		
		carA.speedDown();
		System.out.println(carA.getSpeed());
		
		CarA car = new CarA("CompanyB", "ModelB", "Blue", 300);
		car.speedUp();
		System.out.println(car.getSpeed());
		//System.out.println(car.isAuto());
		
		CarA carx = (CarA)car;
		System.out.println(carx.isAuto());
		
		Car car1 = new CarA("CompanyA", "ModelA", "Red", 200);
		car1.speedUp();
		System.out.println(car1.getSpeed());
		
		car1 = new CarB("CompanyB", "ModelB", "Blue", 300);
		car1.speedUp();
		System.out.println(car1.getSpeed()); //������ �޼ҵ带 ȣ���ص� ca1�� ������ �ν��Ͻ��� ����Ű�Ŀ� ���� ���� �ٸ� ����� �����Ѵ�(�پ缺)
		
		//new GameItem("������"); �߻�Ŭ������ ��üȭ �� �� ����.
		
		car1.setItem(new Turbo("�ͺ�����"));
		car1.getItem().useItem();
		
		car1.setItem(new Bubble("��ǳ��"));
		car1.getItem().useItem();
	}

}
