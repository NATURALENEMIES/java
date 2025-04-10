
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
		return"学生：学号="+sno+",姓名="+sname+",年龄="+age;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Student s[] = { new Student("001", "张三", 19),
				new Student("002", "李四", 20),
				new Student("003", "王五", 20),
				new Student("004", "赵六", 19) };
		System.out.println("学生名单：");
		for (int i = 0; i < s.length; i++) {
			s[i].addAge();
			System.out.println(s[i]);
		}
		System.out.println("年龄大于20岁的学生名单：");
		for (int i = 0; i < s.length; i++) {
			if (s[i].getAge()>20) {
				System.out.println(s[i]);
			}
		}
	}

}
