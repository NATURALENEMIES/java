package CH2;
public class MYString3 {
	// （1）判断字符c在字符串str中出现的次数
	public static int charCount(char c, String str) {
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i) == c) {
	count++;
	}
	}
	return count;
	}

	// （2）判断字符串s在字符串str中出现的次数
	public static int stringCount(String s, String str) {
	int count = 0;
	int index = 0;
	while ((index = str.indexOf(s, index)) != -1) {
	count++;
	index += s.length();
	}
	return count;
	}

	// （3）把字符串str的1到m个字符移到str的最后
	public static String moveStr(String str, int m) {
	if (m >= str.length()) {
	return str;
	}
	String front = str.substring(0, m);
	String behind = str.substring(m);
	return behind + front;
	}

	// （4）对指定的字符串中除首、尾字符外的其余字符进行降序排列
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

	// （5）删除指定字符串末尾的*号
	public static String delStar(String s) {
	while (s.endsWith("*")) {
	s = s.substring(0, s.length() - 1);
	}
	return s;
	}

	// （6）在main方法中测试以上方法是否正确
	public static void main(String[] args) {
	String testStr = "hello*world*";
	char testChar = 'l';
	String subStr = "lo";

	System.out.println("字符 '" + testChar + "' 出现的次数: " + charCount(testChar, testStr));
	System.out.println("字符串 '" + subStr + "' 出现的次数: " + stringCount(subStr, testStr));
	System.out.println("移动后的字符串: " + moveStr(testStr, 5));
	System.out.println("排序后的字符串: " + sort(testStr));
	System.out.println("删除末尾*号后的字符串: " + delStar(testStr));
	}
	}