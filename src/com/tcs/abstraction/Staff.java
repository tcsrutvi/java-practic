package com.tcs.abstraction;

public class Staff {

private String name;
	
	public void fillTimesheet() {//partial info
		System.out.println(name+" has filled time sheet");
	}
	//public abstract void work();
}

class HR extends Staff {
	@Override
	public void work() {
		System.out.println("HR is working");
	}
}

class Guard extends Staff {
	@Override
	public void work() {
		System.out.println("Guard is working");
	}
}

