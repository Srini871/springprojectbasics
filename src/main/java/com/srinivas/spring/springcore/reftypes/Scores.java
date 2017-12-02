package com.srinivas.spring.springcore.reftypes;

public class Scores {

	private double maths;
	private double physics;
	private double chemistry;

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public String toString()
	{
		return "Maths: "+this.maths+", Physics: "+this.physics+", Chemistry: "+this.chemistry;
	}
	
}
