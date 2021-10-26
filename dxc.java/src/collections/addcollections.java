package collections;

import java.util.*;

public class addcollections {
	
	 public static void main(String args[]){  
	   ArrayList<String> list=new ArrayList<String>();  
	           list.add("priya");  
	           list.add("deepu");  
	           list.add("lucky");  
	             
	           HashSet<String> set=new HashSet(list);  
	           set.add("sweety");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  
	}  


