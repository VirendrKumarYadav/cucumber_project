package queue_pkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Class {

	
	
	public static void main(String[] args) {
		
//		Array List -growable
//		Hetro-
//		insertion order
//		{1,2,3,4,5,5}
		
		List list=new ArrayList<>();
		list.add("Name");
		list.add(6);
		list.add(new List_Class());
		list.add(true);
		
//		int num=;
		System.out.println(list.toString());
		List<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(2);
		list1.add(null);
		System.out.println(list1.toString());
		}
}
