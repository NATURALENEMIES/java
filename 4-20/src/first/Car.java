package first;

class Car extends Vehicle {
	protected int loader;
	protected int wheels;
	protected double weight;
	public Car() {
		super();
		this.loader = 0;
	}

	public Car(int wheels, double weight, int loader) {
		super(wheels, weight);
		this.loader = loader;
	}

	
	public String toString() {
		return "Ð¡³µ [wheels=" + wheels + ", weight=" + weight + ", loader=" + loader + "]";
	}
}
