package com.zensar;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Getter {
}

class Sample {
	private String name;
	
	@Getter
	public String getName() {
		return this.name;
	}
	@Getter
	public String getAddress() {
		return "Pune";
	}
	@Getter
	public void foo() {
	}
}

public class GetterAnnotationTest {

	public static void main(String[] args) throws Exception {
		Class classSample = Sample.class;
		Method methods[] = classSample.getDeclaredMethods();
		for(Method method:methods) {
			Annotation annotations[] = method.getAnnotations();
			for(Annotation annotation: annotations) {
				if(annotation.toString().contains("Getter")) {
					//logic to confirm whether its legal to apply Getter annotation for this method.
					String methodName = method.getName();
					if(methodName.startsWith("get")) {
						String expetcedField = methodName.substring(3).toLowerCase();
						try {
							Field field = classSample.getDeclaredField(expetcedField);
						}catch(NoSuchFieldException e) {
							System.out.println("Its illegal to apply Getter annotation: " + methodName);
						}
					}
					else {
						System.out.println("Its illegal to apply Getter annotation: " + methodName);
					}
				}
			}
		}
	}
}







