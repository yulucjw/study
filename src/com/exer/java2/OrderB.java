package com.exer.java2;
//没有表现出继承
import com.exer.java1.Order;

class Order1 extends Order{
	public void method5(){
//private不能在子类中进行访问
		//orderName="AA";
//default不能在子类中进行访问
		//orderId=1;
//protected能在子类中进行访问
		orderNumber=1002;
//public能在子类中进行访问
		orderDesc=null;
//protected能在子类中进行访问
		method3();
//default不能在子类中进行访问
//		method2();
	}
}

public class OrderB {
	public static void main(String[] args) {
		Order o=new Order();
//private只能在类内部进行访问
		//o.orderName();
//default只能在类内部,同一个包内部进行访问
		//o.orderId=1;
//protected只能在类内部,同一个包内部,子类中进行访问
		//o.orderNumber=1001;
//public可以在任何地方进行访问
		o.orderDesc=null;

	}
}
