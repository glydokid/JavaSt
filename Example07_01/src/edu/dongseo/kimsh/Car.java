package edu.dongseo.kimsh;

public class Car {
	protected String company;
	protected String model;
	protected String color;
	
	protected int maxspeed;
	
	protected int speed; //���� ��Ű�� �ȿ� �ִ� Ŭ������  �ڽ� Ŭ���������� ���� ����ϴ� �ɼ� protected

	protected GameItem item; //�ʵ��� �پ缺 . ���� ȣ��Ǵ� �żҵ�� �������̵� �Ǿ��ִ� �żҽ��� ȣ��
	
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

	public void setItem(GameItem item) {//�Ű������� �پ缺
		this.item = item;
	}
	
	
}
