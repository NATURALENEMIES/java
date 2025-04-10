package ch1;
public class gmy4 {
private int sno;
private String sname;
private boolean sex;
private double height;
private double weight;

public gmy4() {
}

public gmy4(int sno, String sname, boolean sex, double height, double weight) {
this.sno = sno;
this.sname = sname;
this.sex = sex;
this.height = height;
this.weight = weight;
}

public int getSno() {
return sno;
}

public void setSno(int sno) {
this.sno = sno;
}

public String getSname() {
return sname;
}

public void setSname(String sname) {
this.sname = sname;
}

public boolean isSex() {
return sex;
}

public void setSex(boolean sex) {
this.sex = sex;
}

public double getHeight() {
return height;
}

public void setHeight(double height) {
this.height = height;
}

public double getWeight() {
return weight;
}

public void setWeight(double weight) {
this.weight = weight;
}

@Override
public String toString() {
return "Student[" + sno + ", " + sname + ", " + sex + ", " + height + ", " + weight + "]";
}

public String getBMIStatus() {
double bmi = weight / (height * height / 10000.0);
if (bmi < 18.5) {
return "ƫ��";
} else if (bmi >= 18.5 && bmi <= 23.9) {
return "����";
} else if (bmi >= 24) {
if (bmi <= 27.9) {
return "ƫ��";
} else {
return "����";
}
}
return "����";
}

public static void main(String[] args) {
gmy4 student=   new gmy4 (2015001, "����", true, 170, 65);
System.out.println(student);
System.out.println("����ֶ�Ϊ��" + student.getBMIStatus());
}
}


