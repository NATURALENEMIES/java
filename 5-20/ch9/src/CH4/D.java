package CH4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class  D{
public static void main(String[] args) {
Random random = new Random();
int winningNumber = random.nextInt(100) + 1; // ����1 - 100֮������������Ϊ�н�����
Scanner scanner = new Scanner(System.in);
while (true) {
try {
System.out.print("��������²�����֣�����'quit'����������'give me hint!'�鿴�н����룩: ");
String input = scanner.nextLine();
if ("quit".equalsIgnoreCase(input)) {
System.out.println("��Ϸ������");
break;
} else if ("give me hint!".equalsIgnoreCase(input)) {
System.out.println("�н�������: " + winningNumber);
break;
} else {
int guess = Integer.parseInt(input);
if (guess == winningNumber) {
System.out.println("���н��ˣ�");
break;
} else {
System.out.println("û���н�");
}
}
} catch (InputMismatchException | NumberFormatException e) {
System.out.println("������һ��������");
}
}
scanner.close();
}
}