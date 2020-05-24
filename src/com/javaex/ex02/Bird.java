package com.javaex.ex02;

public abstract class Bird {

	protected String name;

	// 생성자
	public Bird() {
	}

	public Bird(String name) {
		this.name = name;
	}

	public abstract void fly();

	public abstract void sing();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
	}

}
