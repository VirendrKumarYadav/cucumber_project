package exception;

public class StaticContrlFLow {
//	static int a = 100;
//	 
//    public static void main(String[] args)
//    {
//        print();
//        System.out.println(
//            "Main method has finished its execution");
//    }
// 
//    static
//    {
//        System.out.println(a);
//
//        print();
//        System.out.println("Inside First Static Block");
//    }
// 
//    public static void print()
//    {
//        System.out.println(b);
//    }
//
//    static
//    {
//        System.out.println("Inside Second Static Block");
//    }
//    static int b = 200;

	int i = 10;
	{

		methodOne();
		System.out.println("First Instance Block");
	}

	StaticContrlFLow() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		StaticContrlFLow f = new StaticContrlFLow();
		System.out.println("Main method");
	}

	public void methodOne() {
		System.out.println(j);
	}

	{
		System.out.println("Second Instance Block");
	}

	int j = 20;
}
