package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age=10;
	int price =20; //cannot be accessed/referred inside static block/methods
	public StaticBlockDemo() {
		System.out.println("in constructor..");
	}
	static {//called first, loaded during startup
		final int localVariable = 40;
		System.out.println("this is static block"+ age);
	}
	
	public static void main(String[] args) {
//		StaticBlockDemo blockDemo = new StaticBlockDemo();
//		new StaticBlockDemo();
		
	}
	
	void work() {
//		static int time = 45; //local variable cannot be static
	}
}