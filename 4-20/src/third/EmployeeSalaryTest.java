package third;

public class EmployeeSalaryTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三", 5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("李四", 50, 170);
        SalesEmployee salesEmployee = new SalesEmployee("王五", 20000, 0.1);
        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee("木头六", 20000, 0.1, 3000);
 
        System.out.println(salariedEmployee.name + "的工资: " + salariedEmployee.getSalary());
        System.out.println(hourlyEmployee.name + "的工资: " + hourlyEmployee.getSalary());
        System.out.println(salesEmployee.name + "的工资: " + salesEmployee.getSalary());
        System.out.println(basePlusSalesEmployee.name + "的工资: " + basePlusSalesEmployee.getSalary());
    }
}
