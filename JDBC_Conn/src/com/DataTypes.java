package com;

public class DataTypes {
	
	public void premitiveInteger() {
		
		byte x = 127;
		System.out.println("byte x="+x);
		
		short a = 32767;
		System.out.println("short a ="+a);
		
		int b = 2147483647;
		System.out.println("int b ="+b);
		
		int z;
		//System.out.println("int z ="+z);
		
		long c = 9223372036854775807L;
		System.out.println("long c ="+c);
	}
	
	public void premitiveFraction() {
		float d = 4.123456789F;
		double e = 8.1234567890123456789D;
	}
	
	public void premitiveChar() {
		char f = 'A';
		System.out.println("char f ="+f);
		
		char g = '\u0049';
		System.out.println("char g ="+g);
	}
	
	public void premitiveBoolean() {
		boolean h = true;
		boolean i = false;
		//boolean j = *&^;
		System.out.println("boolean h ="+h);
		System.out.println("boolean i ="+i);
	}
	
	public void nonPremitiveString() {
		String str1 = "hello";
		String str2 = "java";
		System.out.println("String str1  ="+str1);
		System.out.println("String str2  ="+str2);
		System.out.println("String str1+str2  ="+str1+str2);
		System.out.println("String str1+str2  ="+str1+" "+str2);
	
		String str3 = new String("hello World!!!");
		System.out.println("String str3  ="+str3);
	}
	
	
	
	public void myMethod() {
		System.out.println("------------");
		
		int k; // declaration
		k = 90; // assign value to variable k
		
		int m = 70; // declare and assign
	}

	public static void main(String[] args) {
		System.out.println("i am from Main()");
		DataTypes d = new DataTypes();
		d.premitiveInteger(); // invokes premitiveInteger()
		//d.myMethod(); // invokes premitiveInteger()
		d.premitiveChar();
		d.premitiveBoolean();
		d.nonPremitiveString();
	}

}
