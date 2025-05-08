package CH2;
public class MYString3 {
	// ��1���ж��ַ�c���ַ���str�г��ֵĴ���
	public static int charCount(char c, String str) {
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i) == c) {
	count++;
	}
	}
	return count;
	}

	// ��2���ж��ַ���s���ַ���str�г��ֵĴ���
	public static int stringCount(String s, String str) {
	int count = 0;
	int index = 0;
	while ((index = str.indexOf(s, index)) != -1) {
	count++;
	index += s.length();
	}
	return count;
	}

	// ��3�����ַ���str��1��m���ַ��Ƶ�str�����
	public static String moveStr(String str, int m) {
	if (m >= str.length()) {
	return str;
	}
	String front = str.substring(0, m);
	String behind = str.substring(m);
	return behind + front;
	}

	// ��4����ָ�����ַ����г��ס�β�ַ���������ַ����н�������
	public static String sort(String str) {
	if (str.length() <= 2) {
	return str;
	}
	char[] chars = str.toCharArray();
	char[] middleChars = new char[chars.length - 2];
	System.arraycopy(chars, 1, middleChars, 0, middleChars.length);
	for (int i = 0; i < middleChars.length - 1; i++) {
	for (int j = 0; j < middleChars.length - i - 1; j++) {
	if (middleChars[j] < middleChars[j + 1]) {
	char temp = middleChars[j];
	middleChars[j] = middleChars[j + 1];
	middleChars[j + 1] = temp;
	}
	}
	}
	System.arraycopy(middleChars, 0, chars, 1, middleChars.length);
	return new String(chars);
	}

	// ��5��ɾ��ָ���ַ���ĩβ��*��
	public static String delStar(String s) {
	while (s.endsWith("*")) {
	s = s.substring(0, s.length() - 1);
	}
	return s;
	}

	// ��6����main�����в������Ϸ����Ƿ���ȷ
	public static void main(String[] args) {
	String testStr = "hello*world*";
	char testChar = 'l';
	String subStr = "lo";

	System.out.println("�ַ� '" + testChar + "' ���ֵĴ���: " + charCount(testChar, testStr));
	System.out.println("�ַ��� '" + subStr + "' ���ֵĴ���: " + stringCount(subStr, testStr));
	System.out.println("�ƶ�����ַ���: " + moveStr(testStr, 5));
	System.out.println("�������ַ���: " + sort(testStr));
	System.out.println("ɾ��ĩβ*�ź���ַ���: " + delStar(testStr));
	}
	}