package CH2;

public class MYString2 {
// ����(1)���ж��ַ�c���ַ���str�г��ֵĴ���
public static int charCount(char c, String str) {
int count = 0;
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) == c) {
count++;
}
}
return count;
}

// ����(2)���ж��ַ���s���ַ���str�г��ֵĴ���
public static int stringCount(String s, String str) {
int count = 0;
int index = 0;
while ((index = str.indexOf(s, index)) != -1) {
count++;
index += s.length();
}
return count;
}

// ����(3)�����ַ���str��1��m���ַ��Ƶ�str�����
public static String moveStr(String str, int m) {
if (m >= str.length()) {
return str;
}
return str.substring(m) + str.substring(0, m);
}

// ����(4)����ָ�����ַ����г��ס�β�ַ���������ַ����н�������
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

// ����(5)��ɾ��ָ���ַ���ĩβ��*��
public static String delStar(String s) {
while (s.endsWith("*")) {
s = s.substring(0, s.length() - 1);
}
return s;
}

public static void main(String[] args) {
// ����charCount����
System.out.println("�ַ�'a'���ַ���'banana'�г��ֵĴ���: " + charCount('a', "banana"));
// ����stringCount����
System.out.println("�ַ���'an'���ַ���'banana'�г��ֵĴ���: " + stringCount("an", "banana"));
// ����moveStr����
System.out.println("���ַ���'abcde'��ǰ3���ַ��Ƶ����: " + moveStr("abcde", 3));
// ����sort����
System.out.println("���ַ���'hello'����β�ַ��⽵������: " + sort("hello"));
// ����delStar����
System.out.println("ɾ���ַ���'abc***'ĩβ��*��: " + delStar("abc***"));
}
}