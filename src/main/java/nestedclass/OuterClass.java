package nestedclass;

public class OuterClass extends Outer2{

	int num1,num2;
	public OuterClass(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public OuterClass() {
		
	}

	
    class InnerClass {

		public int sum(int num1, int num2) {
    
			return num1 + num2;
		}
		
		public int sum() {
		    
			return num1 + num2;
		}

		public int sub(int num1, int num2) {

			return num1 - num2;
		}

		public int multi(int num1, int num2) {

			return num1 * num2;
		}
	}
	
	

}
