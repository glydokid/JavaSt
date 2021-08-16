package edu.dongseo.kimsh;

public class CarA extends Car{
	
	private boolean isAuto = false;

	public CarA(String company, String model, String color, int maxspeed) {
		super(company, model, color, maxspeed);
		// TODO Auto-generated constructor stub
	}

	public boolean isAuto() {
		return isAuto;
	}

	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}
	
	@Override //ÀçÁ¤ÀÇ
	public void speedUp() {
		int sp = this.speed + 20;
		
		if(sp > this.maxspeed)
			sp = this.maxspeed;
		
		this.speed = sp;
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		int sp = this.speed - 20;
		
		if(sp < 0)
			sp = 0;
		
		this.speed = sp;
	}
	
}