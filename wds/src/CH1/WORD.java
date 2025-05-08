package CH1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WORD {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
StringBuffer text = new StringBuffer();

System.out.println("请输入文字（以单独一行'end'结束）:");

// Read input until "end" is entered
while (true) {
String line = scanner.nextLine();
if (line.equalsIgnoreCase("end")) {
break;
}
text.append(line).append("\n");
}

// Remove the last newline character
if (text.length() > 0) {
text.deleteCharAt(text.length() - 1);
}

String textStr = text.toString();

// ① Count English letters
int letterCount = countLetters(textStr);
System.out.println("\n英文字母个数: " + letterCount);

// ② Replace "the" with "a" (case insensitive)
String replacedText = replaceTheWithA(textStr);
System.out.println("\n替换'the'为'a'后的文本:\n" + replacedText);

// ③ Find all digit sequences
System.out.println("\n文本中的数字串:");
findAndPrintDigitSequences(textStr);
}

// Method to count English letters
private static int countLetters(String text) {
int count = 0;
for (char c : text.toCharArray()) {
if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
count++;
}
}
return count;
}

// Method to replace "the" with "a" (case insensitive)
private static String replaceTheWithA(String text) {
// Using regex for case-insensitive replacement
return text.replaceAll("(?i)\\bthe\\b", "a");
}

// Method to find and print all digit sequences
private static void findAndPrintDigitSequences(String text) {
Pattern pattern = Pattern.compile("\\d+");
Matcher matcher = pattern.matcher(text);

boolean found = false;
while (matcher.find()) {
System.out.println(matcher.group());
found = true;
}

if (!found) {
System.out.println("未找到数字串");
}
}
}