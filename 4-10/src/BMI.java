public class BMI {
    // 学生类
    static class Student {
        private long sno;      // 学号
        private String sname; // 姓名
        private boolean sex;  // 性别（true-男，false-女）
        private double height; // 身高（米）
        private double weight;// 体重（kg）

        // 无参构造
        public Student() {}

        // 全参构造
        public Student(long sno, String sname, boolean sex, double height, double weight) {
            this.sno = sno;
            this.sname = sname;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        // Getter和Setter
        public long getSno() { return sno; }
        public void setSno(long sno) { this.sno = sno; }

        public String getSname() { return sname; }
        public void setSname(String sname) { this.sname = sname; }

        public boolean isSex() { return sex; }
        public void setSex(boolean sex) { this.sex = sex; }

        public double getHeight() { return height; }
        public void setHeight(double height) { this.height = height; }

        public double getWeight() { return weight; }
        public void setWeight(double weight) { this.weight = weight; }

        // 重写toString方法（输出身高单位为厘米）
        @Override
        public String toString() {
            return String.format("Student[%d，%s，%b，%.0f，%.0f]", 
                                sno, sname, sex, height * 100, weight);
        }

        // BMI健康状态计算
        public String getBMIStatus() {
            double bmi = weight / (height * height);
            
            if (bmi < 18.5) {
                return "偏瘦";
            } else if (bmi <= 23.9) {
                return "正常";
            } else if (bmi <= 27.9) {
                return "偏胖";
            } else {
                return "肥胖";
            }
        }
    }

    // 测试类
    public static void main(String[] args) {
        // 创建学生对象（身高参数单位为米）
        Student student = new Student(2015001, "张三", true, 1.70, 65);
        
        // 输出学生信息
        System.out.println(student.toString());
        
        // 输出BMI状态
        System.out.println("体重状况：" + student.getBMIStatus());
    }
}