package collections;

import java.util.*;

import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) { 
		LinkedList<String> al=new LinkedList<String>();
		al.add("deepu");
		al.add("uma");
		al.add("lucky");
		al.add("priya");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
