package third;

class SalariedEmployee extends Employee {
    private double salary;
 
    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
 
    @Override
    public double getSalary() {
        return salary;
    }
}
 
