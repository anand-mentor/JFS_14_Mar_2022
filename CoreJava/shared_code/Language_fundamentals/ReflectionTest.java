package com.zensar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class House {
	private String city = "Pune";
	public void foo() {
		System.out.println("Inside foo()");
	}
}
public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		String className = args[0]; //java.lang.String
		Class c = Class.forName(className); //forcefully loads the class definition inside code segment
		Constructor con[] = c.getDeclaredConstructors();
		Field f[] = c.getDeclaredFields();
		Method m[]= c.getDeclaredMethods();
		
		
		Class classHouse = House.class;
		con = classHouse.getDeclaredConstructors();
		f = classHouse.getDeclaredFields();
		m= classHouse.getDeclaredMethods();
		
		for(int i=0;i<con.length;i++)
			System.out.println(con[i]);
		for(int i=0;i<f.length;i++)
			System.out.println(f[i]);
		for(int i=0;i<m.length;i++)
			System.out.println(m[i]);
		
		int modifiers = classHouse.getModifiers();
		System.out.println("Is Abstract class? : " + Modifier.isAbstract(modifiers));
		System.out.println("Is Final class? : " + Modifier.isFinal(modifiers));
		
		Field cityField = classHouse.getDeclaredField("city");
		cityField.setAccessible(true);
		System.out.println("Private city field = " + cityField.get(new House()));
	}

}









