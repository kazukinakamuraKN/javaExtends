package javaMethodTest;

public class Hero {
	private String name;
	private int hp = 100;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	void sleep() {
		this.hp = 100;
	}
}
