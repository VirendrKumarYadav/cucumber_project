package exception;

public class Main {

	
	
	public static void main(String[] args) throws WrongAgeException {
		int age=20;
		if(age>10) {
			throw new WrongAgeException("this is class for worng age exception");
		}else {
			System.out.println("this is the correct age exceptions");
		}
	}
}


