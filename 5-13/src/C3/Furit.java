package C3;

// Fruit.java - ���������
abstract class Fruit {
protected double weigh; // ��������

public Fruit(double weigh) {
this.weigh = weigh;
}

public double getWeight() {
return weigh; // ��ȡ��������
}

//���󷽷���������Ҫʵ���Է���ˮ������
public abstract String getType();
}



