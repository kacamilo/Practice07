package com.javaex.ex02;

public class Duck extends Bird {

	public Duck() {
	}

	public Duck(String name) {
		super(name);
	}

	// 메소드
	public void name(String ducks) {
		System.out.println("오리");
	}

	public void sing() {
		System.out.println("오리" + "(" + getName() + ")가 소리내어 웁니다.");

	}

	public void fly() {
		System.out.println("오리" + "(" + getName() + ")가 날지 않습니다.");
	}

	public void showName() {
		System.out.println("오리" + "의 이름은 " + getName() + " 입니다.");

	}

}
