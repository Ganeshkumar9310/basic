package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class My_AList {

	public static void main(String[] args) {
		// ArrayList and LinkedList allows duplicates
		System.out.print("Array List:"); //Insertion order
		ArrayList<String> ak = new ArrayList();
		ak.add("Mango");
		ak.add("apple");
		ak.add("graphes");
		ak.add("kiwi");
		ak.add("orange");
		System.out.println(ak.get(1));
		/*String a[] = {"a","b"};
		ArrayList<String> aa = new ArrayList<String>(Arrays.asList(a));
		aa.add("c");
		System.out.println(aa);*/
		//linkedlist
		System.out.print("Linked List:");
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(5);
		ll.add(16);
		ll.add(1);
		ll.add(0);
		System.out.println();
		for(Integer i:ll)
		{
			System.out.println(i);
		}
		//hash(No Order)
		System.out.print("Hash Set:");
		HashSet<String> hs = new HashSet<String>();
		hs.add("raja");
		hs.add("raja");
		hs.add("taj");
		hs.add("abi");
		//hs.remove("raja");
		//System.out.println(hs.contains("raja"));
		System.out.print(hs);
		//linkedHashset(Insertion Order)
		System.out.print("Linked HashSet:");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("abc");
		lhs.add("ijk");
		lhs.add("lmn");
		lhs.add("gu");
		System.out.println(lhs);
		//MyTreeSet(Asc Sorting Order)
		System.out.print("Tree Set:");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("sam");
		ts.add("ram");
		ts.add("taj");
		ts.add("zara");
		ts.add("sash");
		System.out.println(ts);
		//MyHashMap
		System.out.print("Hash Map:");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "abi");
		hm.put(27349, "raja");
		hm.put(1000000, "teja");
		hm.put(2, "zara");
		hm.put(7341, "sash");
		System.out.println(hm);
		
		
	}

}
