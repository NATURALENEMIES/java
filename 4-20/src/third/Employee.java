package third;

class Employee {
    protected String name;
 
    public Employee(String name) {
        this.name = name;
    }
 
    public double getSalary() {
        // 默认实现，具体子类会重写
        return 0.0;
    }
}
