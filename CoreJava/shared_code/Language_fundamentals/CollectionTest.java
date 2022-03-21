package com.zensar.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

class Item {
	public String name;
	public Item(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class CollectionTest {

	private static void testHashMap() {
		Map<String, Item> hashMap = new HashMap<String, Item>();
		hashMap.put("Chair", new Item("Wooden Chair"));
		hashMap.put("Table", new Item("Wooden Table"));
		hashMap.put("Laptop", new Item("HP Laptop"));
		hashMap.put("Computer", new Item("HCL Computer"));
		String itemKey = null; //"Ice Cream";
		Item itemValue = null; //new Item("Ice Cream");
		hashMap.put(itemKey, itemValue);
		
		Item item = hashMap.get("Laptop");
		System.out.println("item = " + item);
	}

	private static void testHashtable() {
		Map<String, Item> hashtable = new Hashtable<String, Item>();
		hashtable.put("Chair", new Item("Wooden Chair"));
		hashtable.put("Table", new Item("Wooden Table"));
		hashtable.put("Laptop", new Item("HP Laptop"));
		hashtable.put("Computer", new Item("HCL Computer"));
		String itemKey = "Ice Cream";
		Item itemValue = new Item("Ice Cream");
		if(itemKey!=null && itemValue!=null)
			hashtable.put(itemKey, itemValue);
		
		Item item = hashtable.get("Laptop");
		System.out.println("item = " + item);
	}
	private static void testArrayList() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Tom");
		arrayList.add("Jerry");
		arrayList.add("Ivan");
		arrayList.remove("Jerry");
		Iterator<String> itr = arrayList.iterator(); //itr is similar to linkedlist HEAD
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}

	private static void testVector() {
		List<String> vector = new Vector<String>();
		vector.add("Tom");
		vector.add("Jerry");
		vector.add("Ivan");
		vector.remove("Jerry");
		Iterator<String> itr = vector.iterator(); //itr is similar to linkedlist HEAD
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		Vector<String> vector_2 = new Vector<String>();
		vector_2.add("Tom");
		vector_2.add("Jerry");
		vector_2.add("Ivan");
		vector_2.add("Tom");
		vector_2.add("Jerry");
		vector_2.add("Ivan");
		vector_2.add("Tom");
		vector_2.add("Jerry");
		vector_2.add("Ivan");
		vector_2.add("Tom");
		vector_2.add("Jerry");
		vector_2.add("Ivan");
		System.out.println("Capacity: " + vector_2.capacity());
		System.out.println("Size: " + vector_2.size());
	}
	private static void testLinkedList() {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Tom");
		linkedList.add("Jerry");
		linkedList.add("Ivan");
		linkedList.remove("Jerry");
		Iterator<String> itr = linkedList.iterator(); //itr is similar to linkedlist HEAD
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		//testLinkedList();
		//testVector();
		//testArrayList();
		//testHashtable();
		testHashMap();
	}

}
