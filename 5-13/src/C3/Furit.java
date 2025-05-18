package C3;

// Fruit.java - 定义抽象类
abstract class Fruit {
protected double weigh; // 重量属性

public Fruit(double weigh) {
this.weigh = weigh;
}

public double getWeight() {
return weigh; // 获取重量方法
}

//抽象方法，子类需要实现以返回水果类型
public abstract String getType();
}



