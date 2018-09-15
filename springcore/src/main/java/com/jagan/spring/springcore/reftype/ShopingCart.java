package com.jagan.spring.springcore.reftype;

public class ShopingCart {

	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShopingCart [item=" + item + "]";
	}
	
	
}
