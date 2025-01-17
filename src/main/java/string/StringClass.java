package string;

import java.util.Iterator;

public class StringClass {
//how to count no of word
//how to check word or sentence is palindrome or not	
//how to count frequency of char
	
public static void main(String[] args) {
	
	
	String str="String_data";
	String arr[]=str.split("");//["S","t","r"]
	
//	for (int i = str.length()-1; i >=0; i--) {
//			System.out.print(arr[i]);
//	}
//	
	System.out.println(isPalindrome("mom1"));
	
//	dad mom
	
//	String str1=str+"immutable";
//	
//	StringBuffer sb=new StringBuffer("String");
//	System.out.println(str1);
//	System.out.println(str);
//	sb.append("_hello");
//	sb.substring(0, 0);
////	sb.reverse();
////	sb.delete(2, 5);
//	System.out.println(sb);
//	
	
}
	

public static boolean isPalindrome(String str) {
	
	String strRev="";
	
	for (int i = str.length()-1;i>=0;  i--) {
		strRev+=str.charAt(i);
	}

	if(str.equalsIgnoreCase(strRev)) 
		return true;
	else 
		return false;
	
}
	

	
}
