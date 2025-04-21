package first;

class Truck extends Car {
	private double payload;

	public Truck() {
		super();
		this.payload = 0.0;
	}

	public Truck(int wheels, double weight, int loader, double payload) {
		super(wheels, weight, loader);
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "¿¨³µ [wheels=" + wheels + ", weight=" + weight + ", loader=" + loader + ", payload=" + payload + "]";
	}
}