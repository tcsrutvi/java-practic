package tcs.com.map.demo;

public class Student {

	private float math;
	private float biology;
	private float physics;
	
	public Student(float math, float biology, float physics) {
		
		this.math = math;
		this.biology = biology;
		this.physics = physics;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getBiology() {
		return biology;
	}

	public void setBiology(float biology) {
		this.biology = biology;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "Student [math=" + math + ", biology=" + biology + ", physics=" + physics + "]";
	}
	
	

	
}
