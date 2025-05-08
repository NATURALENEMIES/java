package CH4;

import java.util.Calendar;
import java.util.Scanner;

public class CALENDAR {
public static void printMonthCalendar(int year, int month) {
Calendar calendar = Calendar.getInstance();
calendar.set(year, month - 1, 1);

System.out.println("日\t一\t二\t三\t四\t五\t六");

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
System.out.println("========== " + year + "年" + month + "月 ==========");
printMonthCalendar(year, month);
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("请输入年: ");
int year = scanner.nextInt();

System.out.print("请输入月: ");
int month = scanner.nextInt();

printMonthCalendar(year, month);

System.out.println("拓展功能：输出该年12个月的月历");
printYearCalendars(year);

scanner.close();
}
}
