package com.zensar.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
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


class DOB {
	public int day;
	public int month;
	public int year;
	public DOB(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(day + "" + month);
	}
	@Override
	public boolean equals(Object obj) {
		DOB dob = (DOB)obj;
		if(dob.day==this.day && dob.month==this.month)
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "DOB [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

class Employee implements Comparable<Employee> {
	public int id;
	public String name;
	public double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		//return this.name.compareTo(emp.name);
		if(this.salary > emp.salary)
			return 1;
		else if(this.salary < emp.salary)
			return -1;
		return 0;
	}
}
class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.id > emp2.id)
			return -1;
		else if(emp1.id < emp2.id)
			return 1;
		return 0;
	}
	
}
public class CollectionTest {

	private static void testTreeSet() {
		Set<Employee> empTreeSet = new TreeSet<Employee>(new EmployeeIdComparator());
		empTreeSet.add(new Employee(1, "Tom", 12000));
		empTreeSet.add(new Employee(2, "Jerry", 19000));
		empTreeSet.add(new Employee(3, "Ivan", 35000));

		Iterator<Employee> itr1 = empTreeSet.iterator();
		while(itr1.hasNext()) {
			Employee key = itr1.next();
			System.out.println("Key = " + key);
		}
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Tom");
		treeSet.add("Jerry");
		treeSet.add("Ivan");
		treeSet.add("Jerry");
		Iterator<String> itr2 = treeSet.iterator();
		while(itr2.hasNext()) {
			String key = itr2.next();
			System.out.println("Key = " + key);
		}
	}
	
	private static void testTreeMap() {
		Map<String, Item> treeMap = new TreeMap<>();
		treeMap.put("Chair", new Item("Wooden Chair"));
		treeMap.put("Table", new Item("Wooden Table"));
		treeMap.put("Laptop", new Item("HP Laptop"));
		treeMap.put("Computer", new Item("HCL Computer"));

		Set<Entry<String, Item>> entrySet = treeMap.entrySet();
		Iterator<Entry<String, Item>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Entry<String, Item> entry = itr.next();
			System.out.println("Entry: " + entry.getKey() + " - " + entry.getValue());
		}
	}
	
	private static void testHashSet() { //unordered collection
		Set<String> hset = new HashSet<String>();
		hset.add("Tom");
		hset.add("Jerry");
		hset.add("Ivan");
		hset.add("Jerry");
		
		Iterator<String> itr2 = hset.iterator();
		while(itr2.hasNext()) {
			String key = itr2.next();
			System.out.println("Key = " + key);
		}
	}
	
	private static void testAssignment3() {
		Map<DOB, String> hashMap = new HashMap<DOB, String>();
		DOB dob1 = new DOB(12, 1, 2002);
		DOB dob2 = new DOB(12, 1, 2008);
		hashMap.put(dob1, "Tom");
		hashMap.put(new DOB(25, 8, 2010), "Jerry");
		hashMap.put(dob2, "Ivan");
		
		DOB dob3 = new DOB(12, 1, 2002);
		String empName = hashMap.get(dob3);
		System.out.println("empName = " + empName);
	}
	
	private static void testHashMap() {
		Map<String, Item> hashMap = new HashMap<String, Item>();
		hashMap.put("Chair", new Item("Wooden Chair"));
		hashMap.put("Table", new Item("Wooden Table"));
		hashMap.put("Laptop", new Item("HP Laptop"));
		hashMap.put("Computer", new Item("HCL Computer"));
		String itemKey = null; //"Ice Cream";
		Item itemValue = null; //new Item("Ice Cream");
		hashMap.put(itemKey, itemValue);
		
		Set<Entry<String, Item>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, Item>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Entry<String, Item> entry = itr.next();
			System.out.println("Entry: " + entry.getKey() + " - " + entry.getValue());
		}
		
		Set<String> set = hashMap.keySet();
		Iterator<String> itr2 = set.iterator();
		while(itr2.hasNext()) {
			String key = itr2.next();
			System.out.println("Key = " + key);
		}
		
		Collection<Item> items = hashMap.values();
		Iterator<Item> itr3 = items.iterator();
		while(itr3.hasNext()) {
			Item value = itr3.next();
			System.out.println("Value = " + value);
		}
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
		//testHashMap();
		//testAssignment3();
		testHashSet();
		//testTreeMap();
		//testTreeSet();
	}

}
