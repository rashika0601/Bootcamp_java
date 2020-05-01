import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
 
public class Collection 
{
public static void main(String[] args)
{

		 // ArrayList Object Creation
		
		ArrayList<String> a1=new ArrayList<String>();  
		a1.add("infosys"); //adding object in arraylist    
		a1.add("Dmart");    
		a1.add("Bridgelab");     
 
		//LinkedList Object Creation
		
		LinkedList<String> l1=new LinkedList<String>();   
		l1.add("Rakesh");  //adding object in linkedlist    
		l1.add("Nagesh");    
		l1.add("Gauthaum");
		
		
		//Vector object creation
		
		Vector<String> v1=new Vector<String>(); 
		v1.add("Ramesh"); 
		v1.addElement("Bikash");  
		
		//HashSet object creation
		
		HashSet<String>set=new HashSet<String>();
		set.add("ranna");
		set.add("gunaa");
		
		//Linked HashSet object creation
		
		LinkedHashSet<String>lh=new LinkedHashSet<String>();
		lh.add("ravi");
		lh.add("shyam");
		
		//TreeSet object creation
	
		TreeSet<String>t=new TreeSet<String>();
		t.add("zebra");
		t.add("tiger");
 
		
		//HashMap object creation
		
		HashMap<Integer, String>h = new HashMap<Integer, String>();
		h.put(10, "Raju");
		h.put(21, "Rancho");

		//Linked HashMap object creation
		
		LinkedHashMap<Integer, String>lhm = new LinkedHashMap<Integer,String>();
		lhm.put(15, "Farhan");
		lhm.put(28, "murti");
		
		// HashTable object Creation
		
		Hashtable<String, Integer>ht = new Hashtable<String, Integer>();
		ht.put("akash",30);
		ht.put("deepak", 85);
		
		System.out.println("arraylist: "+a1);  
		System.out.println("linkedlist: "+l1);
		System.out.println("Vector: "+v1);
		System.out.println("Hashset: "+ set);
		System.out.println("LinkedHashset: "+ lh);
		System.out.println("Treeset: "+ t);
		System.out.println("HashMap: "+ h);
		System.out.println("LinkedHashMap: "+ lhm);	
		System.out.println("HashTree: "+ ht);	
 
	}
 
}
 
