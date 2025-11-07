package com.yedam.exam;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	
	Chef chef;
	
	public Restaurant(Chef chef) {
		super();
		this.chef = chef;
	}

	public void order() {
		chef.cook();
	}
}
