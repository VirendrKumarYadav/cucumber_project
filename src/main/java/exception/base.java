package exception;

import string.*;

public class base {

	public static void main(String args[]) {
//		Main.main(args);

//        try { 
//            // Following file does not exist 
//            File file = new File("E://file.txt"); 
//            FileReader fr = new FileReader(file); 
//        } catch (FileNotFoundException e) { 
//           System.out.println("File does not exist"); 
//        } 

				Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
