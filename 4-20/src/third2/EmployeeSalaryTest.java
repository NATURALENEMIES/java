package third2;

public class EmployeeSalaryTest {
public static void main(String[] args) {
// 创建各类员工对象
SalariedEmployee se = new SalariedEmployee("张三", 5000);
HourlyEmployee he = new HourlyEmployee("李四", 30, 180);
SalesEmployee salesEmp = new SalesEmployee("王五", 100000, 0.08);
BasePlusSalesEmployee baseSalesEmp = new BasePlusSalesEmployee("赵六", 150000, 0.1, 3000);

// 计算并输出工资
System.out.println(se.name + "的固定工资：" + se.getSalary());
System.out.println(he.name + "的小时工资：" + he.getSalary());
System.out.println(salesEmp.name + "的销售工资：" + salesEmp.getSalary());
System.out.println(baseSalesEmp.name + "的底薪销售工资：" + baseSalesEmp.getSalary());
}
}