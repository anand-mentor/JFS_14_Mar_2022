package com.zensar;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Animal {
	String type() default "bird";
	int height() default 10;
}

class Cat {
	String name = "Jenny";
	
	@Override
	@Animal
	public String toString() {
		return this.name;
	}
	
}
public class AnnotationTest {

	public static void main(String[] args) throws Exception {
		Class classCat = Cat.class;
		Annotation annotations[] = classCat.getDeclaredAnnotations();
		Method method = classCat.getDeclaredMethod("toString", null);
		annotations = method.getAnnotations();
		for(int i=0;i<annotations.length;i++)
			System.out.println(annotations[i]);
	}

}
