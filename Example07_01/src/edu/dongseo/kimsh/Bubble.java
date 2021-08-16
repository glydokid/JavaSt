package edu.dongseo.kimsh;

public class Bubble extends GameItem {

	public Bubble(String itemName) {
		super(itemName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useItem() {
		// TODO Auto-generated method stub
		System.out.println("물풍선으로 후방의 자동차를 괴롭힙니다.");
	}
 
}
