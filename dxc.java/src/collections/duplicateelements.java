package collections;

import java.util.*;

public class duplicateelements {
	
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	  HashSet<String> set=new HashSet<String>();  
	  set.add("deepu");  
	  set.add("lucky");  
	  set.add("priya");  
	  set.add("lucky");  
	  //Traversing elements  
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  


