package CH3;

import java.time.LocalDate;
import java.time.Period;

public class DAY1 {
public static void main(String[] args) {
LocalDate birthDate = LocalDate.of(2004, 12, 07);
LocalDate currentDate = LocalDate.now();

Period period = Period.between(birthDate, currentDate);
int years = period.getYears();
int months = period.getMonths();
int days = period.getDays();

// �������������򵥰�ÿ��365�죬ÿ��30����㣨δ��ȷ��������������
int totalDays = years * 365 + months * 30 + days;
System.out.println("�ӳ��������ھ���������ԼΪ: " + totalDays + " ��");
}
}