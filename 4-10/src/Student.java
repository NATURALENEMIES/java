
public class Student {
	private String sno;
	private String sname;
	private int age;

	public Student() {

	}

	public Student(String sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}

	public void addAge() {
		age++;
	}
	public String toString()
	{
		return"ѧ����ѧ��="+sno+",����="+sname+",����="+age;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Student s[] = { new Student("001", "����", 19),
				new Student("002", "����", 20),
				new Student("003", "����", 20),
				new Student("004", "����", 19) };
		System.out.println("ѧ��������");
		for (int i = 0; i < s.length; i++) {
			s[i].addAge();
			System.out.println(s[i]);
		}
		System.out.println("�������20���ѧ��������");
		for (int i = 0; i < s.length; i++) {
			if (s[i].getAge()>20) {
				System.out.println(s[i]);
			}
		}
	}

}
