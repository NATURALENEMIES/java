package A1;

import A1.Advertisement;
import A1.Car;
import A1.Displayable;
import A1.Notice;

public class Main {
public static void main(String[] args) {
// ʹ�ýӿ����ô�������
Displayable notice = new Notice("��������3�㿪��");
Displayable car = new Car(45.5);
Displayable ad = new Advertisement("��Ʒ���У���ʱ�Żݣ�");

// ͨ���ӿ����ñ���ִ��display()����
notice.display();
car.display();
ad.display();
}
}