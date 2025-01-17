package pages;

public class Child extends Parent {
	
	static String Name="";
	
	public Child(String name) {
		super(name);
		this.Name=name;
		// TODO Auto-generated constructor stub
		System.out.println("Parametrized "+name);
	}

	public static void solution() {
		// TODO Auto-generated method stub
		System.out.println("sol1 "+Name);

	}
	
	
	
}
