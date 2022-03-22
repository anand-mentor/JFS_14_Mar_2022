package com.zensar.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeVsFailFast implements Runnable {

	Thread t1, t2;
	List<Integer> arrayList = new ArrayList<Integer>(); //Fail-Fast iterator
	//List<Integer> arrayList = new CopyOnWriteArrayList<Integer>(); //Fail-Safe iterator
	
	public FailSafeVsFailFast() {
		arrayList.add(24);
		arrayList.add(45);
		t1 = new Thread(this, "ITERATE");
		t2 = new Thread(this, "ADD");
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("ITERATE")) {
			for(;;) {
				Iterator<Integer> itr = arrayList.iterator();
				while(itr.hasNext()) {
					System.out.println("Iterate: " + itr.next());
					try { Thread.sleep(300); } catch(Exception e) { e.printStackTrace(); }
				}
			}
		}
		else if(Thread.currentThread().getName().equals("ADD")) {
			for(;;) {
				try { Thread.sleep(500); } catch(Exception e) { e.printStackTrace(); }
				arrayList.add(30);
				System.out.println("ADD: data added");
			}
		}
	}
	public static void main(String[] args) {
		new FailSafeVsFailFast();
	}

}
