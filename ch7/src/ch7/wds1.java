package ch7;

// Person类
class Person {
    private String name;
    private String gender;
    private int age;

    // 构造方法
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

// Teacher类，继承自Person类
class Teacher extends Person {
    private String title;
    private String department;

    // 构造方法
    public Teacher(String name, String gender, int age, String title, String department) {
        super(name, gender, age);
        this.title = title;
        this.department = department;
    }

    // toString方法
    @Override
    public String toString() {
        return "Teacher{" +
                "title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", " + super.toString() +
                '}';
    }
}

// Student类，继承自Person类
class Student extends Person {
    private String studentId;
    private String enrollmentTime;
    private String major;

    // 构造方法
    public Student(String name, String gender, int age, String studentId, String enrollmentTime, String major) {
        super(name, gender, age);
        this.studentId = studentId;
        this.enrollmentTime = enrollmentTime;
        this.major = major;
    }

    // toString方法
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

// 测试类
public class wds1 {
    public static void main(String[] args) {
        // 创建Person对象并测试
        Person person = new Person("张三", "男", 30);
        System.out.println(person);

        // 创建Teacher对象并测试
        Teacher teacher = new Teacher("李四", "女", 35, "副教授", "计算机系");
        System.out.println(teacher);

        // 创建Student对象并测试
        Student student = new Student("王五", "男", 20, "2025001", "2025-09", "计算机科学与技术");
        System.out.println(student);
    }
}