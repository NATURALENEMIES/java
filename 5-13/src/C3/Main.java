package C3;

// Main.java - ������
public class Main {
public static void main(String[] args) {
// ����ˮ�����鲢�������ˮ������
Fruit[] fruits = new Fruit[5];
fruits[0] = (Fruit) new Apple(0.15); // 0.15kg��ƻ��
fruits[1] = new Peach(0.12); // 0.12kg������
fruits[2] = new Orange(0.18); // 0.18kg������
fruits[3] = new Apple(0.20); // 0.20kg��ƻ��
fruits[4] = new Peach(0.10); // 0.10kg������

// �������鲢���ˮ�����ͺ�����
for (Fruit fruit : fruits) {
System.out.println("ˮ������: " + fruit.getType() +
", ����: " + fruit.getWeight() + "kg");
}

/*
* ���������Ŀ��ʾʹ��getClass().getName()������
* ���Խ�getType()�����滻Ϊ��
* public String getType() {
* return this.getClass().getSimpleName();
* }
* ���������������(Apple/Peach/Orange)��������ˮ����
*/
}
}