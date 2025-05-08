package CH3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DAY2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("计算从出生到现在经历的天数");
System.out.println("请输入你的出生日期（格式：YYYY-MM-DD）：");
String birthDateStr = scanner.nextLine();

try {
// 解析输入的出生日期
LocalDate birthDate = LocalDate.parse(birthDateStr);
LocalDate currentDate = LocalDate.now();

// 计算天数差
long daysAlive = calculateDaysBetween(birthDate, currentDate);

System.out.println("\n从 " + birthDate + " 到 " + currentDate);
System.out.println("你已经经历了 " + daysAlive + " 天");

// 额外信息：计算年、月、日
Period period = Period.between(birthDate, currentDate);
System.out.println("\n相当于:");
System.out.println(period.getYears() + " 年 " +
period.getMonths() + " 个月 " +
period.getDays() + " 天");

} catch (Exception e) {
System.out.println("日期格式不正确，请使用 YYYY-MM-DD 格式（例如：2000-01-15）");
}
}

// 计算两个日期之间的天数差
private static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
return java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
}
}