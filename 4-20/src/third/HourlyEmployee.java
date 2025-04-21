package third;

class HourlyEmployee extends Employee {
    private double hourSalary;
    private int hours;
 
    public HourlyEmployee(String name, double hourSalary, int hours) {
        super(name);
        this.hourSalary = hourSalary;
        this.hours = hours;
    }
 
    @Override
    public double getSalary() {
        if (hours > 160) {
            return 160 * hourSalary + (hours - 160) * hourSalary * 1.5;
        } else {
            return hours * hourSalary;
        }
    }
}