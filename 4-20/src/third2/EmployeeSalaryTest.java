package third2;

public class EmployeeSalaryTest {
public static void main(String[] args) {
// ��������Ա������
SalariedEmployee se = new SalariedEmployee("����", 5000);
HourlyEmployee he = new HourlyEmployee("����", 30, 180);
SalesEmployee salesEmp = new SalesEmployee("����", 100000, 0.08);
BasePlusSalesEmployee baseSalesEmp = new BasePlusSalesEmployee("����", 150000, 0.1, 3000);

// ���㲢�������
System.out.println(se.name + "�Ĺ̶����ʣ�" + se.getSalary());
System.out.println(he.name + "��Сʱ���ʣ�" + he.getSalary());
System.out.println(salesEmp.name + "�����۹��ʣ�" + salesEmp.getSalary());
System.out.println(baseSalesEmp.name + "�ĵ�н���۹��ʣ�" + baseSalesEmp.getSalary());
}
}