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

// 计算总天数，简单按每年365天，每月30天估算（未精确处理闰年等情况）
int totalDays = years * 365 + months * 30 + days;
System.out.println("从出生到现在经历的天数约为: " + totalDays + " 天");
}
}