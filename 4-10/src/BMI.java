public class BMI {
    // ѧ����
    static class Student {
        private long sno;      // ѧ��
        private String sname; // ����
        private boolean sex;  // �Ա�true-�У�false-Ů��
        private double height; // ��ߣ��ף�
        private double weight;// ���أ�kg��

        // �޲ι���
        public Student() {}

        // ȫ�ι���
        public Student(long sno, String sname, boolean sex, double height, double weight) {
            this.sno = sno;
            this.sname = sname;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        // Getter��Setter
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

        // ��дtoString�����������ߵ�λΪ���ף�
        @Override
        public String toString() {
            return String.format("Student[%d��%s��%b��%.0f��%.0f]", 
                                sno, sname, sex, height * 100, weight);
        }

        // BMI����״̬����
        public String getBMIStatus() {
            double bmi = weight / (height * height);
            
            if (bmi < 18.5) {
                return "ƫ��";
            } else if (bmi <= 23.9) {
                return "����";
            } else if (bmi <= 27.9) {
                return "ƫ��";
            } else {
                return "����";
            }
        }
    }

    // ������
    public static void main(String[] args) {
        // ����ѧ��������߲�����λΪ�ף�
        Student student = new Student(2015001, "����", true, 1.70, 65);
        
        // ���ѧ����Ϣ
        System.out.println(student.toString());
        
        // ���BMI״̬
        System.out.println("����״����" + student.getBMIStatus());
    }
}