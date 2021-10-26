package collections;

import java.util.*;
public class reverselist {
  
	 public static void main(String args[]){  
	  
	  LinkedList<String> al=new LinkedList<String>();  
	           al.add("lucky");  
	           al.add("priya");  
	           al.add("deepu");  
	           //Traversing the list of elements in reverse order  
	           Iterator i=al.descendingIterator();  
	           while(i.hasNext())  
	           {  
	               System.out.println(i.next());  
	           }  
	             
	 }  
	}  


