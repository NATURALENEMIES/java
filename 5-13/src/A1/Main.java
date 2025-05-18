package A1;

import A1.Advertisement;
import A1.Car;
import A1.Displayable;
import A1.Notice;

public class Main {
public static void main(String[] args) {
// 使用接口引用创建对象
Displayable notice = new Notice("明天下午3点开会");
Displayable car = new Car(45.5);
Displayable ad = new Advertisement("新品上市，限时优惠！");

// 通过接口引用变量执行display()方法
notice.display();
car.display();
ad.display();
}
}