package third;

public class EmployeeSalaryTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("����", 5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("����", 50, 170);
        SalesEmployee salesEmployee = new SalesEmployee("����", 20000, 0.1);
        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee("ľͷ��", 20000, 0.1, 3000);
 
        System.out.println(salariedEmployee.name + "�Ĺ���: " + salariedEmployee.getSalary());
        System.out.println(hourlyEmployee.name + "�Ĺ���: " + hourlyEmployee.getSalary());
        System.out.println(salesEmployee.name + "�Ĺ���: " + salesEmployee.getSalary());
        System.out.println(basePlusSalesEmployee.name + "�Ĺ���: " + basePlusSalesEmployee.getSalary());
    }
}
