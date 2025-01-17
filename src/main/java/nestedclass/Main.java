package nestedclass;

import java.util.Iterator;

public class Main {

	
	
	public static void main(String[] args) {
//		new OuterClass(20,15).new InnerClass().sum();
//		new OuterClass().new InnerClass().sum(20,40);
//		OuterClass ot=new OuterClass();
//		ot.new InnerClass();
		
		String str="Yuvraj";
		String str2="YUVraj";
		
		String str1=str+" Bha...";
		
		  
		
//		System.out.println(str1+" "+str);
		
//		new String("Yuvraj Bhask...");
		
//		for (int i = 0; i < str.length(); i++) {
//			 System.out.println(str.charAt(i));
//			
//		}
//		String strArr[]=str.split("");
//		System.out.println(strArr[0]);
		String strArr[]=str.split(" ");
//		System.out.println(strArr[1]);
		System.out.println(str.equalsIgnoreCase(str2));
		
//		
		System.out.println(new String("Youvraj").equals(new String("Youvraj")));
		
		
	}
}

