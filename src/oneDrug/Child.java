package oneDrug;

public class Child extends People {

	People father;
	public Child(String name){
		System.out.print(3);
		this.name = name;
		father = new People(name + ":F");
	}
	public Child(){
		System.out.print(4);
	}
	public static void main(String[] args) {
		new Child("maker");//子类有或无参数构造方法，都会调用父类无参构造方法。 132
		
	}
}
