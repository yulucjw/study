package com.exer.java1;
//
public class Order {
	private String orderName;
	int orderId;
	protected int orderNumber;
	public String orderDesc;
	
	private void method1(){
//private，default,protected,public都可以在类的内部进行访问
		orderName="AA";
	}
	void method2(){
		
	}
	protected void method3(){
		
	}
	public void method4(){
		
	}
}
