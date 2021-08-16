package edu.dongseo.kimsh;

public class CarB extends Car {

	public CarB(String company, String model, String color, int maxspeed) {
		super(company, model, color, maxspeed);
		// TODO Auto-generated constructor stub
	}

	@Override //ÀçÁ¤ÀÇ
	public void speedUp() {
		// TODO Auto-generated method stub
		int sp = this.speed + 30;
		
		if(sp > this.maxspeed)
			sp = this.maxspeed;
		
		this.speed = sp;
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		int sp = this.speed - 30;
		
		if(sp < 0)
			sp = 0;
		
		this.speed = sp;
	}
	
}
