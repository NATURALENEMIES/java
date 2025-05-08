package CH4;

import java.util.Calendar;
import java.util.Scanner;

public class CALENDAR {
public static void printMonthCalendar(int year, int month) {
Calendar calendar = Calendar.getInstance();
calendar.set(year, month - 1, 1);

System.out.println("��\tһ\t��\t��\t��\t��\t��");

int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

for (int i = 1; i < firstDayOfWeek; i++) {
System.out.print("\t");
}

for (int i = 1; i <= daysInMonth; i++) {
System.out.print(i + "\t");
if ((firstDayOfWeek + i - 1) % 7 == 0) {
System.out.println();
}
}
System.out.println();
}

public static void printYearCalendars(int year) {
for (int month = 1; month <= 12; month++) {
System.out.println("========== " + year + "��" + month + "�� ==========");
printMonthCalendar(year, month);
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("��������: ");
int year = scanner.nextInt();

System.out.print("��������: ");
int month = scanner.nextInt();

printMonthCalendar(year, month);

System.out.println("��չ���ܣ��������12���µ�����");
printYearCalendars(year);

scanner.close();
}
}
