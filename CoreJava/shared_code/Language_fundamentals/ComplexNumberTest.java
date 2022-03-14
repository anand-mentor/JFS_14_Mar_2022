package com.zensar;

class ComplexNumber {
	private int real;
	private int imaginary;
	public ComplexNumber() {
		this.real = 5;
		this.imaginary = 7;
	}
	public ComplexNumber(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", imaginary=" + imaginary + "]";
	}
	public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber cn3 = new ComplexNumber();
		cn3.setReal(cn1.getReal() + cn2.getReal());
		cn3.setImaginary(cn1.getImaginary() + cn2.getImaginary());
		return cn3;
	}
	public ComplexNumber add(ComplexNumber cn) {
		ComplexNumber cn3 = new ComplexNumber();
		cn3.setReal(this.getReal() + cn.getReal());
		cn3.setImaginary(this.getImaginary() + cn.getImaginary());
		return cn3;
	}
	/*
	public static void swap(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp = null;
		temp = c1;
		c1 = c2;
		c2 = temp;
	}
	*/
	public static void swap(ComplexNumber c[]) {
		ComplexNumber temp = null;
		temp = c[0];
		c[0] = c[1];
		c[1] = temp;
	}
}

public class ComplexNumberTest {

	public static void main(String[] args) {
		
		ComplexNumber cn[] = new ComplexNumber[2]; //Creates ComplexNumber array object
		
		cn[0] = new ComplexNumber(5, 4);
		cn[1] = new ComplexNumber(2, 7);
		
		System.out.println("cn[0] " + cn[0]);
		System.out.println("cn[1] " + cn[1]);
		ComplexNumber.swap(cn);
		System.out.println("After swap cn[0] " + cn[0]);
		System.out.println("After swap cn[1] " + cn[1]);
	
	}
	
	/*
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber(5, 4);
		ComplexNumber cn2 = new ComplexNumber(2, 7);
		ComplexNumber cn3 = ComplexNumber.add(cn1, cn2);
		System.out.println("Addition: " + cn3);
		
		//cn1.add(cn2);
		System.out.println("cn1 " + cn1);
		System.out.println("cn2 " + cn2);
		ComplexNumber.swap(cn1, cn2);
		System.out.println("After swap cn1 " + cn1);
		System.out.println("After swap cn2 " + cn2);
	}
	*/

}
