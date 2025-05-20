package CH4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class  D{
public static void main(String[] args) {
Random random = new Random();
int winningNumber = random.nextInt(100) + 1; // 生成1 - 100之间的随机整数作为中奖号码
Scanner scanner = new Scanner(System.in);
while (true) {
try {
System.out.print("请输入你猜测的数字（输入'quit'结束，输入'give me hint!'查看中奖号码）: ");
String input = scanner.nextLine();
if ("quit".equalsIgnoreCase(input)) {
System.out.println("游戏结束。");
break;
} else if ("give me hint!".equalsIgnoreCase(input)) {
System.out.println("中奖号码是: " + winningNumber);
break;
} else {
int guess = Integer.parseInt(input);
if (guess == winningNumber) {
System.out.println("你中奖了！");
break;
} else {
System.out.println("没有中奖");
}
}
} catch (InputMismatchException | NumberFormatException e) {
System.out.println("请输入一个整数。");
}
}
scanner.close();
}
}