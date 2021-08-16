package edu.dongseo.kimsh;

public abstract class GameItem {
	String itemName;

	public GameItem(String itemName) {
		this.itemName = itemName;
	}
	
	public abstract void useItem();
	
}
