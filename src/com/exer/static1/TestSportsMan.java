package com.exer.static1;
/*
 * static 可以用来修饰属性，方法
 * 
 * static修饰属性：
 * 1.由类创建的所有对象都公用这一个属性
 * 2.当其中一个对象对此属性修改会导致其他对象对此属性的一个调用 vs 实例变量（非static修饰的属性）各自有一套副本
 * 3.类变量是随着类的加载而加载的。而且独一份。
 * 4.静态的变量可以直接通过"类.类变量"的形式调用。
 * 5.类变量的加载是要早于对象的，所以当有对象以后，可以“对象.类变量”调用，但是通过“类.实例变量”是不行的
 * 6.静态变量（类变量）存在于静态域里
 * 
 * static修饰方法：
 * 1.随着类的加载而加载，在内存中也是独一份
 * 2.可以直接通过“类.类方法”的方式调用
 * 3.在静态方法内部可以调用静态的属性或方法而不能调用非静态的，反之，非静态的方法是可以调用静态的属性或方法
 * 》静态方法内不可以有this或super关键字的。
 * 注：静态的结构（静态的属性，方法，代码块，内部类）的生命周期早于非静态的结构，同时被回收也要晚于非静态的结构
 * 
 */
//final  继承  没有表现出 static
public class TestSportsMan {
	public static void main(String[] args) {
		
		SportsMan s1=new SportsMan("金角",22);
		SportsMan s2=new SportsMan("银角",22);
		s1.name="铁角";
		s1.nation="China";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(SportsMan.nation);
		
		//SportsMan.show();
		s1.show1();
		SportsMan.show2();
		s1.show2();
	}
}
class SportsMan{
	//实例变量随着对象的创建而被加载的
	String name;
	int age;
	//类变量
	static String nation;
	public SportsMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.nation="China";
	}
	@Override
	public String toString() {
		return "SportsMan [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
	
	public void show1(){
		System.out.println("age:"+this.age);
		System.out.println("nation:"+nation);
		info();
		System.out.println("我是来自中国的运动员");
	}
	
	public static void show2(){
		System.out.println("nation:"+nation);
		info();
		//show1();
		//System.out.println("age:"+this.age);
		System.out.println("我是来自中国的运动员");
	}
	
	public static void info(){
		System.out.println("我是静态方法");
	}
}