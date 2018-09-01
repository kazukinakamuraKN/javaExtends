package javaMethodTest;

public class Main {
	public static void main(String[]args) {
		String s = "World";
		HelloWorld h = new HelloWorld();
		HelloWorld2 h2 = new HelloWorld2();
		h.World(s);
		h2.getName();
		SuperHero sH = new SuperHero();
		System.out.println(sH.getHp());
		sH.sleep();
		System.out.println(sH.getHp());
		Hero hh = new Hero();
		System.out.println(hh.getHp());
	}
}
