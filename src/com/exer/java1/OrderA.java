package com.exer.java1;
//方法
public class OrderA {
	public static void main(String[] args) {
		Order o=new Order();
//private不可以在同一个包内进行访问，只能在类内部进行访问
		//o.orderName();
//default可以在同一个包内部进行访问
		o.orderId=1;
//protected可以在同一个包内进行访问
		o.orderNumber=1001;
//public可以在同一个包内进行访问
		o.orderDesc=null;	
	}
}
