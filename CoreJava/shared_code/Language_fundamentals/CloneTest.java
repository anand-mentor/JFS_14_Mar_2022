package com.zensar;

class Company implements Cloneable{
	String name;

	public Company(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Company c1 = new Company("Zensar");
		Company c2 = c1;
		System.out.println("c1==c2 " + (c1==c2)); //True
		Company c3 = (Company)c1.clone();
		System.out.println("c1==c3 " + (c1==c3)); //False
	}

}
