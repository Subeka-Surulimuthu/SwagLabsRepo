package PageObject;

import java.util.ArrayList;
import java.util.List;

public class streamtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("aa");
		list1.add("bb");
		list1.add("cc");
		list1.add("dd");
		list1.add("ee");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("aa");
		list2.add("bb");
		list2.add("cc");
		list2.add("kk");
		
		
		
		list1.stream().anyMatch(element->list2.contains(element));
	//	System.out.println(var);
		
	if(list1.containsAll(list2)) {
		System.out.println("elements are present");
	}else
		System.out.println("not present");

	}
	
	

}
