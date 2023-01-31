package com.example;
	
	class A
	{
	int a;
	A(int a)
	{
	this.a=a;
	}}
	class B extends A
	{
	int b,c;
	B(int a,int b, int c)
	{
	super(a);
	this.b=b;
	this.c=c;
	}
	void display()
	{
	System.out.print(super.a+" "+this.c);
	}
	public static void main(String[] args) {
		new B(10,20,30).display();
	}
		
	
	}

