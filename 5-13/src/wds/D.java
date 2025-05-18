package wds;
// 定义接口
interface StartStop {
void start();
void stop();
}

// 会议类实现接口
class Meeting implements StartStop {
@Override
public void start() {
System.out.println("会议开始");
}

@Override
public void stop() {
System.out.println("会议结束");
}
}

// 汽车类实现接口
class bus implements StartStop {
@Override
public void start() {
System.out.println("汽车启动");
}

@Override
public void stop() {
System.out.println("汽车停止");
}
}

public class D {
public static void main(String[] args) {
// 创建StartStop接口类型的数组
StartStop[] startStopArray = new StartStop[2];
// 创建会议和汽车对象并赋值给数组
startStopArray[0] = new Meeting();
startStopArray[1] = new bus();

// 遍历数组，调用start()方法
for (StartStop element : startStopArray) {
element.start();
}

// 遍历数组，调用stop()方法
for (StartStop element : startStopArray) {
element.stop();
}
}
}