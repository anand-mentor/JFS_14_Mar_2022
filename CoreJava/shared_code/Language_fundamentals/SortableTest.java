package com.zensar.sort;

interface Sortable {
	public boolean compare(Sortable sortable);
}

class Circle implements Sortable {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public boolean compare(Sortable sortable) {
		Circle circle= (Circle)sortable;
		if(this.radius > circle.radius)
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Circle: " + this.radius;
	}
}
public class SortableTest {

	public static void main(String[] args) {
		Sortable sortCircle[] = new Sortable[4];
		sortCircle[0] = new Circle(23);
		sortCircle[1] = new Circle(54);
		sortCircle[2] = new Circle(10);
		sortCircle[3] = new Circle(17);
		sortAll(sortCircle);
		for(int i=0;i<sortCircle.length;i++) {
			System.out.println(sortCircle[i]);
		}
	}
	public static void sortAll(Sortable s[]) {
		for(int i=0;i<(s.length-1);i++) {
			for(int j=(i+1);j<s.length;j++) {
				if(s[i].compare(s[j])) {
					Sortable temp = null;
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}

}
