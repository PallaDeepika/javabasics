package collections;

import java.util.*;

public class removeelements { 
 
	  
	        public static void main(String [] args)  
	        {  
	           LinkedList<String> al=new LinkedList<String>();  
	           al.add("deepu");  
	           al.add("Vijay");  
	           al.add("uma");  
	           al.add("Anu");  
	           al.add("lucky");  
	           al.add("Harsha");  
	           al.add("sana");  
	           al.add("lucky");  
	           al.add("Harsha");  
	           al.add("priya");  
	           System.out.println("Initial list of elements: "+al);  
	         //Removing specific element from arraylist  
	              al.remove("Vijay");  
	              System.out.println("After invoking remove(object) method: "+al);   
	         //Removing element on the basis of specific position  
	              al.remove(0);  
	              System.out.println("After invoking remove(index) method: "+al);   
	              LinkedList<String> al2=new LinkedList<String>();  
	              al2.add("harsha");  
	              al2.add("sana");  
	         // Adding new elements to arraylist  
	              al.addAll(al2);  
	              System.out.println("Updated list : "+al);   
	         //Removing all the new elements from arraylist  
	              al.removeAll(al2);  
	              System.out.println("After invoking removeAll() method: "+al);   
	         //Removing first element from the list  
	              al.removeFirst();  
	              System.out.println("After invoking removeFirst() method: "+al);  
	          //Removing first element from the list  
	              al.removeLast();  
	              System.out.println("After invoking removeLast() method: "+al);  
	          //Removing first occurrence of element from the list  
	              al.removeFirstOccurrence("Gaurav");  
	              System.out.println("After invoking removeFirstOccurrence() method: "+al);  
	          //Removing last occurrence of element from the list  
	              al.removeLastOccurrence("Harsh");  
	              System.out.println("After invoking removeLastOccurrence() method: "+al);  
	  
	              //Removing all the elements available in the list       
	              al.clear();  
	              System.out.println("After invoking clear() method: "+al);   
	       }  
	    }                   



