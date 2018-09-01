package javaMethodTest;

import java.util.Random;

public class Cleric {
	String name;
	int HP = 50;
	static final int MaxHP = 50;
	int MP = 10;
	static final int MaxMP = 10;

	Cleric(String name,int HP , int MP){
		this.name = "asaka";
		this.HP = 40;
		this.MP = 5;
	}
	Cleric(String name,int HP){
		this(name,HP,Cleric.MaxMP);
	}
	Cleric(String name){
		this(name, Cleric.MaxHP);
	}

	void selfAid() {
		this.HP = Cleric.MaxHP;
		this.MP -= 5;
	}

	int pray(int prayTime) {
		int recover = new Random().nextInt(3) + prayTime;
		int recoverActual = Math.min(Cleric.MaxMP - this.MP, recover);
		this.MP += recoverActual;
		return recoverActual;
	}
}
