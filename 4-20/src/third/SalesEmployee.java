package third;

class SalesEmployee extends Employee {
    protected double sale;
    protected double commissionRate;
 
    public SalesEmployee(String name, double sale, double commissionRate) {
        super(name);
        this.sale = sale;
        this.commissionRate = commissionRate;
    }
 
    @Override
    public double getSalary() {
        return sale * commissionRate;
    }
}