package collections;

import java.util.*;

public class addelements {
	  
	public class LinkedList2{  
	 public static void main(String args[]){  
	 LinkedList<String> al=new LinkedList<String>();  
	           System.out.println("Initial list of elements: "+al);  
	           al.add("lucky");  
	           al.add("Vijay");  
	           al.add("deepu");  
	           System.out.println("After invoking add(E e) method: "+al);  
	           //Adding an element at the specific position  
	           al.add(1, "priya");  
	           System.out.println("After invoking add(int index, E element) method: "+al);  
	           LinkedList<String> al2=new LinkedList<String>();  
	           al2.add("padma");  
	           al2.add("sree");  
	           //Adding second list elements to the first list  
	           al.addAll(al2);  
	           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
	           LinkedList<String> al3=new LinkedList<String>();  
	           al3.add("sana");  
	           al3.add("uma");  
	           //Adding second list elements to the first list at specific position  
	           al.addAll(1, al3);  
	           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
	           //Adding an element at the first position  
	           al.addFirst("hema");  
	           System.out.println("After invoking addFirst(E e) method: "+al);  
	           //Adding an element at the last position  
	           al.addLast("jyo");  
	           System.out.println("After invoking addLast(E e) method: "+al);  
	             
	 }  
	}  

}
