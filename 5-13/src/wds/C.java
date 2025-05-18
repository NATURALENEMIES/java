package wds;

abstract class Fruit {
	protected double weight;

	public Fruit(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}

class Apple extends Fruit {
	public Apple(double weight) {
		super(weight);
	}
}

class Peach extends Fruit {
	public Peach(double weight) {
		super(weight);
	}
}

class Orange extends Fruit {
	public Orange(double weight) {
		super(weight);
	}
}

public class C {
	public static void main(String[] args) {
		Fruit[] fruits = { new Apple(10.5), new Peach(8.3), new Orange(9.2) };

		for (Fruit fruit : fruits) {
			System.out.println("ˮ������: " + fruit.getClass().getName() + ", ����: " + fruit.getWeight());
		}
	}
}
