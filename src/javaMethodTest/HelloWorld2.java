package javaMethodTest;

public class HelloWorld2 {
	private String str1,str2,str3;

	public void getName() {
		System.out.println(this.str1+this.str2+this.str3);
	}
	public void setName(String name1,String name2,String name3) {
		if(name1 == null) {
			throw new IllegalArgumentException
			("名前がnullです");
		}
		this.str1 = name1;
		this.str2 = name2;
		this.str3 = name3;

	}
	HelloWorld2(String x,String y,String z){
		this.str1 = x;
		this.str2 = y;
		this.str3 = z;
	}

	HelloWorld2(){
		this("Hello", ",","World");
	}
}
