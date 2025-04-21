package first;

class Vehicle {
	protected int wheels;
	protected double weight;

	public Vehicle() {
		this.wheels = 0;
		this.weight = 0.0;
	}

	public Vehicle(int wheels, double weight) {
		this.wheels = wheels;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "³µÁ¾ [wheels=" + wheels + ", weight=" + weight + "]";
	}
}
