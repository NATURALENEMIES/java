package wds;
// ����ӿ�
interface StartStop {
void start();
void stop();
}

// ������ʵ�ֽӿ�
class Meeting implements StartStop {
@Override
public void start() {
System.out.println("���鿪ʼ");
}

@Override
public void stop() {
System.out.println("�������");
}
}

// ������ʵ�ֽӿ�
class bus implements StartStop {
@Override
public void start() {
System.out.println("��������");
}

@Override
public void stop() {
System.out.println("����ֹͣ");
}
}

public class D {
public static void main(String[] args) {
// ����StartStop�ӿ����͵�����
StartStop[] startStopArray = new StartStop[2];
// ����������������󲢸�ֵ������
startStopArray[0] = new Meeting();
startStopArray[1] = new bus();

// �������飬����start()����
for (StartStop element : startStopArray) {
element.start();
}

// �������飬����stop()����
for (StartStop element : startStopArray) {
element.stop();
}
}
}