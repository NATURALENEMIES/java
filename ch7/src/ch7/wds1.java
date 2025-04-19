package ch7;

// Person��
class Person {
    private String name;
    private String gender;
    private int age;

    // ���췽��
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // toString����
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

// Teacher�࣬�̳���Person��
class Teacher extends Person {
    private String title;
    private String department;

    // ���췽��
    public Teacher(String name, String gender, int age, String title, String department) {
        super(name, gender, age);
        this.title = title;
        this.department = department;
    }

    // toString����
    @Override
    public String toString() {
        return "Teacher{" +
                "title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", " + super.toString() +
                '}';
    }
}

// Student�࣬�̳���Person��
class Student extends Person {
    private String studentId;
    private String enrollmentTime;
    private String major;

    // ���췽��
    public Student(String name, String gender, int age, String studentId, String enrollmentTime, String major) {
        super(name, gender, age);
        this.studentId = studentId;
        this.enrollmentTime = enrollmentTime;
        this.major = major;
    }

    // toString����
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", enrollmentTime='" + enrollmentTime + '\'' +
                ", major='" + major + '\'' +
                ", " + super.toString() +
                '}';
    }
}

// ������
public class wds1 {
    public static void main(String[] args) {
        // ����Person���󲢲���
        Person person = new Person("����", "��", 30);
        System.out.println(person);

        // ����Teacher���󲢲���
        Teacher teacher = new Teacher("����", "Ů", 35, "������", "�����ϵ");
        System.out.println(teacher);

        // ����Student���󲢲���
        Student student = new Student("����", "��", 20, "2025001", "2025-09", "�������ѧ�뼼��");
        System.out.println(student);
    }
}