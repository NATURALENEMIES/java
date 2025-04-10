package ch1;

class Student {
private int studentId;
private String name;
private int age;

public Student(int studentId, String name, int age) {
this.studentId = studentId;
this.name = name;
this.age = age;
}

public int getStudentId() {
return studentId;
}

public String getName() {
return name;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

@Override
public String toString() {
return "Student{" +
"studentId=" + studentId +
", name='" + name + '\'' +
", age=" + age +
'}';
}
}

public class gmy2 {
public static void main(String[] args) {
Student[] students = {
new Student(1, "张三", 18),
new Student(2, "李四", 22),
new Student(3, "王五", 19)
};

for (Student student : students) {
student.setAge(student.getAge() + 1);
}

for (Student student : students) {
System.out.println(student);
}

for (Student student : students) {
if (student.getAge() > 20) {
System.out.println("年龄大于20岁的学生: " + student);
}
}
}
}

