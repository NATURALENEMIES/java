package CH3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DAY2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("����ӳ��������ھ���������");
System.out.println("��������ĳ������ڣ���ʽ��YYYY-MM-DD����");
String birthDateStr = scanner.nextLine();

try {
// ��������ĳ�������
LocalDate birthDate = LocalDate.parse(birthDateStr);
LocalDate currentDate = LocalDate.now();

// ����������
long daysAlive = calculateDaysBetween(birthDate, currentDate);

System.out.println("\n�� " + birthDate + " �� " + currentDate);
System.out.println("���Ѿ������� " + daysAlive + " ��");

// ������Ϣ�������ꡢ�¡���
Period period = Period.between(birthDate, currentDate);
System.out.println("\n�൱��:");
System.out.println(period.getYears() + " �� " +
period.getMonths() + " ���� " +
period.getDays() + " ��");

} catch (Exception e) {
System.out.println("���ڸ�ʽ����ȷ����ʹ�� YYYY-MM-DD ��ʽ�����磺2000-01-15��");
}
}

// ������������֮���������
private static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
return java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
}
}