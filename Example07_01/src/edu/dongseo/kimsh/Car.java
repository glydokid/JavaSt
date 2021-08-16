package edu.dongseo.kimsh;

public class Car {
	protected String company;
	protected String model;
	protected String color;
	
	protected int maxspeed;
	
	protected int speed; //같은 패키지 안에 있는 클래스나  자식 클래스까지는 접근 허용하는 옵션 protected

	protected GameItem item; //필드의 다양성 . 실제 호출되는 매소드는 오버라이딩 되어있는 매소스가 호출
	
	public Car(String company, String model, String color, int maxspeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	public void speedUp(){
		int sp = this.speed + 10;
		
		if(sp > this.maxspeed)
			sp = this.maxspeed;
		
		this.speed = sp;
	}
	public void speedDown() {
		int sp = this.speed - 10;
		
		if(sp < 0)
			sp = 0;
		
		this.speed = sp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public int getSpeed() {
		return speed;
	}

	public GameItem getItem() {
		return item;
	}

	public void setItem(GameItem item) {//매개변수의 다양성
		this.item = item;
	}
	
	
}
