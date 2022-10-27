package chapter06;

public class Singleton {
	
	// static 객체를 생성하지않아도 사용할수있음
	private String name;
	private static Singleton instance = new Singleton();

	private Singleton() {

	}
	public static Singleton getInstance() {
		return instance;
	} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this. name= name;
	}

}
