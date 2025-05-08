package CH2;

public class MYString {

// (1) Count occurrences of a character in a string
public static int charCount(char c, String str) {
int count = 0;
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) == c) {
count++;
}
}
return count;
}

// (2) Count occurrences of a substring in a string
public static int stringCount(String s, String str) {
if (s.isEmpty()) return 0;

int count = 0;
int index = 0;
while ((index = str.indexOf(s, index)) != -1) {
count++;
index += s.length();
}
return count;
}

// (3) Move first m characters to the end of the string
public static String moveStr(String str, int m) {
if (m <= 0 || m >= str.length()) {
return str;
}
return str.substring(m) + str.substring(0, m);
}

// (4) Sort characters (except first and last) in descending order
public static String sort(String str) {
if (str.length() <= 2) {
return str;
}

char[] chars = str.toCharArray();
// Sort from index 1 to length-2
for (int i = 1; i < chars.length - 1; i++) {
for (int j = i + 1; j < chars.length - 1; j++) {
if (chars[i] < chars[j]) {
char temp = chars[i];
chars[i] = chars[j];
chars[j] = temp;
}
}
}
return new String(chars);
}

// (5) Remove asterisks from the end of the string
public static String delStar(String s) {
int end = s.length();
while (end > 0 && s.charAt(end - 1) == '*') {
end--;
}
return s.substring(0, end);
}

// (6) Main method to test all functions
public static void main(String[] args) {
// Test charCount
System.out.println("charCount('l', \"Hello World\") = " +
charCount('l', "Hello World")); // Should return 3

// Test stringCount
System.out.println("stringCount(\"lo\", \"Hello lol World\") = " +
stringCount("lo", "Hello lol World")); // Should return 2

// Test moveStr
System.out.println("moveStr(\"abcdef\", 2) = " +
moveStr("abcdef", 2)); // Should return "cdefab"

// Test sort
System.out.println("sort(\"hello\") = " +
sort("hello")); // Should return "hlleo" or similar

// Test delStar
System.out.println("delStar(\"Hello***\") = " +
delStar("Hello***")); // Should return "Hello"
System.out.println("delStar(\"**Hello**\") = " +
delStar("**Hello**")); // Should return "**Hello"
}
}