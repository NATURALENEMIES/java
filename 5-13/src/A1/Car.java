package A1;


class Car implements Displayable {
private double fuelLevel;

public Car(double fuelLevel) {
this.fuelLevel = fuelLevel;
}

@Override
public void display() {
System.out.println("Æû³µÓÍÁ¿: " + fuelLevel + "L");
}
}
