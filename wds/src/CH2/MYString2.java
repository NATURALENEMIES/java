package CH2;

public class MYString2 {
// 方法(1)：判断字符c在字符串str中出现的次数
public static int charCount(char c, String str) {
int count = 0;
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) == c) {
count++;
}
}
return count;
}

// 方法(2)：判断字符串s在字符串str中出现的次数
public static int stringCount(String s, String str) {
int count = 0;
int index = 0;
while ((index = str.indexOf(s, index)) != -1) {
count++;
index += s.length();
}
return count;
}

// 方法(3)：把字符串str的1到m个字符移到str的最后
public static String moveStr(String str, int m) {
if (m >= str.length()) {
return str;
}
return str.substring(m) + str.substring(0, m);
}

// 方法(4)：对指定的字符串中除首、尾字符外的其余字符进行降序排列
public static String sort(String str) {
if (str.length() <= 2) {
return str;
}
char[] chars = str.substring(1, str.length() - 1).toCharArray();
for (int i = 0; i < chars.length - 1; i++) {
for (int j = 0; j < chars.length - i - 1; j++) {
if (chars[j] < chars[j + 1]) {
char temp = chars[j];
chars[j] = chars[j + 1];
chars[j + 1] = temp;
}
}
}
return str.charAt(0) + new String(chars) + str.charAt(str.length() - 1);
}

// 方法(5)：删除指定字符串末尾的*号
public static String delStar(String s) {
while (s.endsWith("*")) {
s = s.substring(0, s.length() - 1);
}
return s;
}

public static void main(String[] args) {
// 测试charCount方法
System.out.println("字符'a'在字符串'banana'中出现的次数: " + charCount('a', "banana"));
// 测试stringCount方法
System.out.println("字符串'an'在字符串'banana'中出现的次数: " + stringCount("an", "banana"));
// 测试moveStr方法
System.out.println("把字符串'abcde'的前3个字符移到最后: " + moveStr("abcde", 3));
// 测试sort方法
System.out.println("对字符串'hello'除首尾字符外降序排列: " + sort("hello"));
// 测试delStar方法
System.out.println("删除字符串'abc***'末尾的*号: " + delStar("abc***"));
}
}