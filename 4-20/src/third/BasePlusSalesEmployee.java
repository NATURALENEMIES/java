package third;

class BasePlusSalesEmployee extends SalesEmployee {
    private double basicSalary;
 
    public BasePlusSalesEmployee(String name, double sale, double commissionRate, double basicSalary) {
        super(name, sale, commissionRate);
        this.basicSalary = basicSalary;
    }
 
    @Override
    public double getSalary() {
        return basicSalary + sale * commissionRate;
    }
}