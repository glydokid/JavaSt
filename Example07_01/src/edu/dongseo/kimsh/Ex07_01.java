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
		System.out.println(car1.getSpeed()); //동일한 메소드를 호출해도 ca1의 누구의 인스턴스를 가르키냐에 따라서 서로 다른 결과를 도출한다(다양성)
		
		//new GameItem("아이템"); 추상클래스로 객체화 할 수 없다.
		
		car1.setItem(new Turbo("터보엔진"));
		car1.getItem().useItem();
		
		car1.setItem(new Bubble("물풍선"));
		car1.getItem().useItem();
	}

}
